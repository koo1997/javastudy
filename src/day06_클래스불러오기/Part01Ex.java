package day06_클래스불러오기;

import java.util.Scanner;

public class Part01Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		
		String b;
		System.out.println("id:");
		a=sc.next();
		System.out.println("pw:");
		b=sc.next();
		Part01 sum = new Part01(a,b);
		System.out.println(sum.idCheck());
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("id:");
//			a=sc.next();
//			System.out.println("pw:");
//			b=sc.next();
//			Part01 sum=new Part01(a,b);
//			String re = sum.idCheck();
//			System.out.println(sum.idCheck());
//			if(re=="로그인성공") {
//				System.out.println("id:"+a);
//				System.out.println("pw:"+b);
//				System.out.println("로그인성공");
//				break;
//			}else {
//				System.out.println("id:"+a);
//				System.out.println("pw:"+b);
//				System.out.println("로그인실패");
//				
//			}
			
//		}
		
		
		
	}

}
