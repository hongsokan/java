<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ko" data-theme="light">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
  <title>CHive-CX v3.0</title>
  <!-- CSS *reset,style,common* -->
  <link href="/web_resources/css_ver3/reset.css" rel="stylesheet" type="text/css">
  <link href="/web_resources/css_ver3/style.css" rel="stylesheet" type="text/css">
  <link href="/web_resources/css_ver3/cnai_common_ver3.css" rel="stylesheet" type="text/css">
  <link href="/web_resources/css_ver3/cnai_custom.css" rel="stylesheet" type="text/css">

  <!-- CSS *font-icons* -->
  <link href="/web_resources/css_ver3/all.min.css" rel="stylesheet" type="text/css">
  <!-- CSS *Calendar*-->
  <link href="/web_resources/css_ver3/daterangepicker.css" rel="stylesheet" type="text/css">
  <!-- jquery -->
  <script src="/web_resources/js_ver3/jquery-3.7.1.js"></script>
  <!-- javascript(Calendar) -->
  <script src="/web_resources/js_ver3/moment.min.js" type="text/javascript"></script>
  <script src="/web_resources/js_ver3/daterangepicker.js" type="text/javascript"></script>

  <!-- Favicon -->
  <link rel="shortcut icon" href="/web_resources/images/favicon.ico"/>
</head>

<body>
<section class="container">
  <!-- ==== SNB | Side-menu ==== *Start* -->
  <section class="snb">
    <!-- #Logo-area *시작* chive-cx 심볼 넣을 경우 'chive' class 추가 -->
    <div class="logo-area chive">
      <!-- #Simbol - div 안에 img 넣기(고객사별) -->
      <div class="simbol"></div>
      <span class="chive__txt">CNAI<span class="chive__txt" style="font-size: 12px; font-weight: 800;">3.0</span></span>
      <!-- #BUTTON | snb-fold *Start* -->
      <button class="btn__snb-fold">
        <i class="fa fa-chevron-left"></i>
      </button>
      <!-- #BUTTON | snb-fold *End* -->
    </div>
    <!-- #Logo-area *끝* -->
    <nav class="menu__wrap">
      <%@include file="temp_include/temp_left.jsp" %>
    </nav>
    <!-- #Menu *끝* -->
  </section>


  <!-- ==== SNB | Side-menu ==== *End* -->
  <!-- ==== CONTENTS ==== *Start* -->
  <main class="contents">
    <!-- #top-bar *시작* -->
    <!-- *내 정보 수정 - side-box *시작*  -->
    <%@include file="../include_common/my_info.jsp" %>
    <!-- *내 정보 수정 - side-box *끝*  -->
    <!-- *내 상담이력 - side-box *시작*  -->
    <%@include file="../include_common/my_approve_history.jsp" %>
    <!-- *내 상담 이력 - side-box *끝*  -->

    <header class="top-bar">
      <%@include file="../include_common/right_user_info_ver3.jsp" %>
    </header>
    <!-- #top-bar *끝* -->
    <!-- #con__wrap *Start* -->
    <section class="con__wrap">
      <div class="con-box__area">
        <!-- ==== #Con-box ==== *Start* -->
        <div class="con-box__wrap w100">
          <div class="con-box style1">
            <div class="con-box__top">
              <button class="btn1 round" onclick="window.location.href='/sales/AddAccount'">
                <i class="fa fa-user-plus"></i>
                <span>기본정보 등록</span>
              </button>
              <button class="btn2 w32x mgl8 pad0">
                <i class="fa fa-undo"></i>
              </button>
            </div>
            <div class="con-box__con">
              <!-- #Search-area *Start* -->
              <div class="flex__l-r">
                <div class="flex__item-c">
                  <div class="flex__item-c mgr24">
                    <span class="mgr8">총</span>
                    <input type="text" id="total_count" name="total_count" class="po__main w40x txt-c pad0">
                    <span class="mgl4">개</span>
                  </div>
                  <label>관리자 계정 :</label>
                  <input type="text" class="w60x mgl8 mgr16" placeholder="00개">
                  <label>사용자 계정 :</label>
                  <input type="text" class="w60x mgl8" placeholder="00개">
                </div>
                <div class="flex__item-c">
                  <input type="text" class="w220x" placeholder="날짜를 선택하세요">
                  <label class="mgl16">검색조건 :</label>
                  <select class="w120x mgl8 link-l">
                    <option>전체</option>
                    <option>고객사명</option>
                    <option>어카운트명</option>
                  </select>
                  <div style="position: relative;">
                    <input type="text" class="link-r w240x in-btn" placeholder="검색어 입력">
                    <button class="btn-search in"><i class="fa fa-search"></i></button>
                  </div>
                </div>
              </div>
              <!-- #Search-area *End* -->
              <!-- #list(table) *Start* -->
              <div class="filled w-line mgt16">
                <table class="tbl__list txt-c">
                  <thead>
                  <tr>
                    <th>No</th>
                    <th>고객사명</th>
                    <th>청구기준</th>
                    <th>발송기준</th>
                    <th>매출/비용</th>
                    <th>어카운트명</th>
                    <th>회선</th>
                    <th>메세지</th>
                    <th>카카오톡</th>
                    <th>계약기간</th>
                    <th>담당자명</th>
                    <th>담당자연락처</th>
                  </tr>
                  </thead>
                  <tbody id="list_tbody">

                  </tbody>
                </table>
              </div>
              <!-- #list(table) *End* -->



              <!-- #테이블 하단(with 페이징) *Start* -->
<%--              <div class="flex__l-r mgt16">--%>
<%--                <input id="limitNumber_1" name="limit_number" type="number"--%>
<%--                       class="w60x" value="10" min="10" max="1000">--%>

<%--                <input type="hidden" name="sort_column" id="sortColumn_">--%>
<%--                <input type="hidden" name="display_pages" value="10">--%>
<%--                <input type="hidden" name="current_page" value="1" id="currentPage_1">--%>

<%--                <div id="pwar_1" class="pwar">--%>
<%--                  <div >--%>
<%--                    &lt;%&ndash; 페이징 스크립트 &ndash;%&gt;--%>
<%--                  </div>--%>
<%--                </div>--%>
<%--              <div class="dp_flex">--%>
<%--                <ul class="paging" id="pagingNew">--%>
<%--                  <!-- 페이징 버튼들 -->--%>
<%--                  <li class="prev" onclick="fetchPage('prev')">이전</li>--%>
<%--                  <li class="num this" onclick="fetchPage(1)">1</li>--%>
<%--                  <li class="num" onclick="fetchPage(2)">2</li>--%>
<%--                  <li class="num" onclick="fetchPage(3)">3</li>--%>
<%--                  <!-- 추가 페이지 버튼들 -->--%>
<%--                  <li class="next" onclick="fetchPage('next')">다음</li>--%>
<%--                </ul>--%>
<%--              </div>--%>
              <!-- #테이블 하단(with 페이징) *End* -->



              <!-- 페이징 시작 -->
              <form id="pagingForm">

                  <div id="pwar_1" class="pwar">
                      <ul class="paging" id ="pagingNew">
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
              <!-- 페이징 종료 -->
            </div>
          </div>
        </div>
        <!-- ==== #Con-box ==== *End* -->
      </div>

      <!-- #Modal - 사원정보 수정 *Start* -->
      <div class="modal__modemp style1" style="width: 560px;">
        <div class="con-box__top">
          <h3>사원정보 수정</h3>
          <button class="btn-x" onclick="modal__modempOff()">
            <span class="tooltip under">닫기</span>
          </button>
        </div>
        <div class="con-box__con">
          <table class="tbl2">
            <tr>
              <th>사원ID<span class="po__red">*</span></th>
              <th>사원명<span class="po__red">*</span></th>
            </tr>
            <tr>
              <td>
                <input type="text" class="fl" style="width: calc(100% - 108px);" placeholder="ID 입력">
                <button class="btn2 w100x mgl8">
                  <i class="fa fa-search"></i>
                  <span>중복검색</span>
                </button>
              </td>
              <td>
                <input type="text" class="w100" placeholder="이름 입력">
              </td>
            </tr>
            <tr>
              <th colspan="2">부서코드<span class="po__red">*</span></th>
            </tr>
            <tr>
              <td>
                <select class="w100">
                  <option>본부명 선택</option>
                  <option>CS센터</option>
                  <option>PS센터</option>
                </select>
              </td>
              <td>
                <select class="w100">
                  <option>팀명 선택</option>
                  <option>메일팀</option>
                  <option>CALL팀</option>
                  <option>채팅팀</option>
                </select>
              </td>
            </tr>
            <tr>
              <th>내선번호<span class="po__red">*</span></th>
              <th>재직여부<span class="po__red">*</span></th>
            </tr>
            <tr>
              <td>
                <input type="text" class="fl" style="width: calc(100% - 108px);" placeholder="숫자 5자리 입력">
                <button class="btn2 w100x mgl8">
                  <i class="fa fa-search"></i>
                  <span>중복검색</span>
                </button>
              </td>
              <td>
                <select class="w100">
                  <option>재직여부 선택</option>
                  <option>재직</option>
                  <option>퇴사</option>
                  <option>휴직</option>
                </select>
              </td>
            </tr>
            <tr>
              <th colspan="2">권한<span class="po__red">*</span></th>
            </tr>
            <tr>
              <td colspan="2">
                <select class="w100">
                  <option>SUPERVISOR</option>
                  <option>AGENT</option>
                  <option>DEV</option>
                </select>
              </td>
            </tr>
            <tr>
              <th>입사일자<span class="po__red">*</span></th>
              <th>퇴사일자</th>
            </tr>
            <tr>
              <td>
                <input type="text" class="w100" placeholder="날짜를 선택하세요" id="daterange">
              </td>
              <td>
                <input type="text" class="w100" placeholder="날짜를 선택하세요" id="daterange">
              </td>
            </tr>
            <tr>
              <th colspan="2">비고</th>
            </tr>
            <tr>
              <td colspan="2">
                <textarea class="w100" style="min-height: 72px"></textarea>
              </td>
            </tr>
          </table>
          <div class="con-box__bottom">
                <span>
                    <span class="po__red mgr2">*</span>필수입력 항목입니다.
                </span>
            <button class="btn1" onclick="modal__modempOff()">
              <i class="fa fa-pencil-alt"></i>
              <span>수정 완료</span>
            </button>
          </div>
        </div>
      </div>
      </div>
    </section>
      <!-- #Modal - 사원정보 수정 *End* -->
      <!-- **** Script(this page only) **** Start **** -->
      <script>
        // 상단바 - 페이지 제목 텍스트
        (function() {
          $('title').text('CNAI - 영업관리');
          $('.top-bar h2 span').filter(':first-child').text('영업 관리 /');
          $('.top-bar h2 span').filter(':last-child').text('거래처 관리');


        }());

        // 모달 팝업
        function modal__addemp() {
          $('.modal__addemp').addClass('show');
          $('.dim').addClass('show');
        }

        function modal__addempOff() {
          $('.modal__addemp').removeClass('show');
          $('.dim').removeClass('show');
        }

        function modal__modemp() {
          $('.modal__modemp').addClass('show');
          $('.dim').addClass('show');
        }

        function modal__modempOff() {
          $('.modal__modemp').removeClass('show');
          $('.dim').removeClass('show');
        }

      </script>
      <!-- **** Script(this page only) **** End **** -->


    <!-- #con__wrap *End* -->

    <!-- #Dim(블랙배경) *Start* -->
    <div class="dim"></div>
    <!-- #Dim(블랙배경) *End* -->
  </main>
  <!-- ==== CONTENTS ==== *End* -->
</section>
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
      method: "post",
      body: form,
    })
            .then((response) => response.json())
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

                if(item.service_type_cd_nm.indexOf('회선') < 0){
                  telLineYN = `\${icon_n}`;
                }
                else{
                  telLineYN = `\${icon_y}`;
                }

                if(item.service_type_cd_nm.indexOf('기업메세지') < 0){
                  messageYN = `\${icon_n}`;
                }
                else{
                  messageYN = `\${icon_y}`;
                }

                if(item.service_type_cd_nm.indexOf('카카오톡') < 0){
                  kakakoYN = `\${icon_n}`;
                }
                else{
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
        
            });

  }

  function createPageButtons(paging) {
    const pagingNew = document.getElementById("pagingNew");
    const currentPageInput = document.getElementById("currentPage_1");

    // pagingNew.innerHTML = "";

    

    // 이전 페이지 버튼
    pagingNew.innerHTML +="<li class='prev'>이전</li>";

    // 페이지 번호 이동
    for (let i = paging.currentPagesBegin; i <= paging.currentPagesEnd; i++) {
      const pageButton = document.createElement('li');
      pageButton.classList.add('num');
      pageButton.textContent = i;

      pageButton.addEventListener('click', function() {
        currentPageInput.value = pageButton.textContent;
        localStorage.setItem("current_page", pageButton.textContent);;
        fetchList();
      });
      pagingNew.appendChild(pageButton);
    }

    // 다음 페이지 버튼
    if (paging.currentPage < paging.currentPagesEnd) {
      pagingNew.innerHTML +="<li class='next'>다음</li>";
    }
  }
</script>

<!-- common.js-->
<script src="/web_resources/js_ver3/common.js"></script>
<!-- 캘린더 rangeCalender.js-->
<script src="/web_resources/js_ver3/rangeCalender.js" type="text/javascript"></script>

</body></html>