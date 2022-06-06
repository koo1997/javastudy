package day05_배열;
import java.util.Scanner;
public class part03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] jumsu = new int[5];
//		int sum=0;
		
		for(int i=0;i<jumsu.length;i++) {
//			jumsu[i] +=sum;
			System.out.println("jumsu"+i+":");
			jumsu[i]= sc.nextInt();
			
		}
		int tot = tot(jumsu);
		System.out.println("총점"+tot);
		
		
	}
	public static int tot(int[] jumsu) {
		int tot=0;
		for(int i=0;i<jumsu.length;i++) {
			tot+=jumsu[i];
		}
		return tot;
	}

}
