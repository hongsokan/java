package ch06.ex;

// login 정보의 대한 내용
class LoginResult {
	boolean result;
	String message;

	public void printResult() {
		System.out.println(this.result + " : " + this.message);
	}
	
	public LoginResult doLogin(String id, String pass) {
		LoginResult result = new LoginResult();
		if(id=="admin" && pass=="1234" ) {
			result.result = true;
			result.message=id+"님 반갑습니다.";
		}else if(id!="admin") {
			result.message = "아이디를 확인하세요.";
		}else {
			result.message="비밀번호를 확인하세요.";
		}
		return result;
	}
}

/*
// login 유효성 검사
class LoginSystem {
	public LoginResult doLogin(String id, String pass) {
		LoginResult result = new LoginResult();
		if(id=="admin" && pass=="1234" ) {
			result.result = true;
			result.message=id+"님 반갑습니다.";
		}else if(id!="admin") {
			result.message = "아이디를 확인하세요.";
		}else {
			result.message="비밀번호를 확인하세요.";
		}
		return result;
	}
}	*/

// main
public class LoginTest {
	public static void main(String[] args) {
		LoginResult login = new LoginResult();
	    LoginResult result = login.doLogin("hong", "1234");
	    result.printResult();
	    //false : 아이디를 확인하세요.

	    result = login.doLogin("admin", "12345");
	    result.printResult(); // false : 비밀번호를 확인하세요.

	    result = login.doLogin("admin", "1234");
	    result.printResult();// true : admin님 반갑습니다.
	  }
}