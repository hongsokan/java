<%--
  Created by IntelliJ IDEA.
  User: hsan
  Date: 2024-03-21
  Time: 오후 3:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="pagingForm">

    <div id="pwar_1" class="pwar">
        <ul class="paging" id="pagingNew">
            <%-- 페이징 스크립트 --%>
        </ul>
        <input type="hidden" name="strict_search" id="strictSearch_"
               value="false">
        <input type="hidden" name="sort_column" id="sortColumn_">
        <input type="hidden" name="display_pages" value="10">
        <input type="hidden" name="current_page" value="1" id="currentPage_1">
    </div>
    <%-- 페이지당 보여질 갯수 조절 --%>
    <div class="nu" id="inwary">
        <input id="limitNumber_1" name="limit_number" type="number"
               class="inwary_box" value="10" min="10" max="1000"
               style="border: 1px solid #f1f3fe; width: 50px; height: 30px; background-color:#f1f3fe">
        <span style="font-weight: bold;">개씩</span> 보기
    </div>
</form>

<script>
    document.addEventListener("DOMContentLoaded", () => {
        fetchList();
    });

    async function fetchList() {
        const listBody = document.getElementById("list_tbody");
        let form = new FormData(document.getElementById("pagingForm"));

        fetch("/sales/ajaxListAccount", {
            headers: {
                Accept: "application / json",
            },
            method: "post",  // default값이 GET이어서 생략이 가능합니다.
            body: form,
        })
            .then((response) => response.json())     // response객체로부터 json포멧 응답 받기
            .then((data) => {
                const totalCount = data.total_count;
                document.getElementById("total_count").value = totalCount;
                const list = data["list"];
                const paging = data["paging"];
                let str = "";

                list.forEach((item, index) => {
                    const orderNum = (paging.totalCount - (paging.offset + index));

                    const icon_y = `<i class="fa fa-genderless"></i>`;
                    const icon_n = `<i class="fa fa-times"></i>`;

                    let telLineYN;
                    let messageYN;
                    let kakakoYN;

                    console.log(item.service_type_cd_nm.indexOf('회선'));
                    console.log(item.service_type_cd);

                    if (item.service_type_cd_nm.indexOf('회선') < 0) {
                        telLineYN = `\${icon_n}`;
                    } else {
                        telLineYN = `\${icon_y}`;
                    }

                    if (item.service_type_cd_nm.indexOf('기업메세지') < 0) {
                        messageYN = `\${icon_n}`;
                    } else {
                        messageYN = `\${icon_y}`;
                    }

                    if (item.service_type_cd_nm.indexOf('카카오톡') < 0) {
                        kakakoYN = `\${icon_n}`;
                    } else {
                        kakakoYN = `\${icon_y}`;
                    }

                    str += `<tr>
                <td>\${orderNum}</td>
                <td>\${item.company_nm}</td>
                <td>\${item.claim_type_cd_nm}</td>
                <td>\${item.claim_send_type_cd_nm}</td>
                <td><span class="txt__in-bg0">\${item.expense_yn}</span></td>
                <td>\${item.account_nm}</td>
                <td>\${telLineYN}</td>
                <td>\${messageYN}</td>
                <td>\${kakakoYN}</td>
                <td>\${item.contract_start_ymd} ~ \${item.contract_end_ymd}</td>
                <td>\${item.representative_nm}</td>
                <td>\${item.representative_contact}</td>
                </tr>`;

                });

                listBody.innerHTML = str;

                createPageButtons(paging);

                // listBody.insertAdjacentHTML('beforeend', str);

            });        // json포멧 응답 javascript 객체로 변한하기

    }


    function createPageButtons(paging) {
        const pagingNew = document.getElementById("pagingNew");
        const currentPageInput = document.getElementById("currentPage_1");

        pagingNew.innerHTML = "";

        // 이전 페이지 버튼
        pagingNew.innerHTML += "<li class='prev'>이전</li>";

        // 페이지 번호 이동
        for (let i = paging.currentPagesBegin; i <= paging.currentPagesEnd; i++) {
            const pageButton = document.createElement('li');
            pageButton.classList.add('num');
            pageButton.textContent = i;

            pageButton.addEventListener('click', function () {
                currentPageInput.value = pageButton.textContent;
                localStorage.setItem("current_page", pageButton.textContent);
                fetchList();
            });
            pagingNew.appendChild(pageButton);
        }

        // 다음 페이지 버튼
        if (paging.currentPage < paging.currentPagesEnd) {
            pagingNew.innerHTML += "<li class='next'>다음</li>";
        }
    }


</script>

</body>
</html>
