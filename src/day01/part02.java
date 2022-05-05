package day01;

public class part02 {

	public static void main(String[] args) {

		//연산식의 자동 타입 변환
		
		byte bytea = 10;
		byte byteb = 20;
		
		int inta = bytea + byteb;
		
		System.out.println(inta);
		
		
		
		char chara = '가';
		char charb = 1;
		
		int intb = chara + charb;
	
		System.out.println(intb);//가의 유니코드
		System.out.println((char)intb);//가+1의 유니코드의 한글
		
		
		
	
		
		
		
	}

}
