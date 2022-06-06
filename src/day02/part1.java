package day02;
import java.util.Scanner;
public class part1 {
	public static void main(String[] args) {
		String name; int kor; int eng; int mat;
		int tot; double avg; String grade;
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 :");
		//next() 한줄 단어 공백이전까지 한 단어 받아서 처리
		name = sc.next();
		System.out.println("국어점수 :");
		//nextInt() 정수 데이터 입력
		kor = sc.nextInt();
		System.out.println("영어점수 :");
		//nextInt() 정수 데이터 입력
		eng = sc.nextInt();
		System.out.println("수학점수 :");
		//nextInt() 정수 데이터 입력
		mat = sc.nextInt();
		
		tot = tot(kor, eng, mat);
		avg = avg(kor, eng, mat);
		grade = grade(kor, eng, mat);
		
		System.out.println("==================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("==================================================");
		System.out.println(name +"\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + 
		avg + "\t" +grade);
		}
	public static int tot(int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		return tot;
	}
	public static double avg(int kor, int eng, int mat) {
		double avg = (kor + eng + mat) / 3.0;
		return avg;
	}
	
	public static String grade(int kor, int eng, int mat) {
		String grade;
		double avg = (kor + eng + mat) / 3.0;
		if(avg >= 60.0 && kor >=40 && eng >= 40 && mat >=40) {
			grade = "합격";
		}else
		{
			grade = "합격";
		}
		return grade;
	}
	}	

