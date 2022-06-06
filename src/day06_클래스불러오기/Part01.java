package day06_클래스불러오기;


public class Part01 {

	String id;
	String pw;
	
	Part01(String id,String pw){
		this.id=id;
		this.pw=pw;
		
	}
	
	String idCheck() {
		if(id=="admin"&&pw=="1111") {
			return "로그인성공";
		}else{
			return "로그인실패";
		}
	}
	
}
