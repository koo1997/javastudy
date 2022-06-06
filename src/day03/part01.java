package day03;

public class part01 {

	public static void main(String[] args) {

		
		int a= 1;
		switch (a) {//a의 값이 1일때 case 1 실행
		case 1:
			System.out.println("헬로");
			break;//1번이 끝났음
		case 2:
			System.out.println("바이");
			break;
		default:// 1,2 모두 해당안될때
			System.out.println("누구?");
			break;
		}
		
	}

}
