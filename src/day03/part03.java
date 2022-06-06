package day03;
import java.util.Scanner;
public class part03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("메뉴 1 로그인 2 성적 ");
		a = sc.nextInt();
		
		switch (a) {
		case 1:
			String id;
			String pw;
			System.out.println("아이디 : ");
			id = sc.next();
			System.out.println("비밀번호 :");
			pw = sc.next();
			
			if(id.equals("admin")) {
				if(pw.equals("123456")) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("비밀번호가 다릅니다");
				}
			}else {
				System.out.println("아이디가 다릅니다");
			}
			
					
					
			break;
		case 2:
			int kor;
			int eng;
			int mat;
			int tot;
			double avg;
			System.out.println("국어점수 :");
			kor = sc.nextInt();
			System.out.println("영어점수 :");
			eng = sc.nextInt();
			System.out.println("수학점수 :");
			mat = sc.nextInt();
			tot = kor+eng+mat;
			avg = tot/3;
			System.out.println("평균 : "+avg);
			if(kor>=60 && eng>=60 && mat>=60 && avg>=60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
			
			
			break;
		default:
			System.out.println("번호를 잘못눌렀습니다");
			break;
		}
		
		
	}

}
