package day05_배열;
import java.util.Scanner;
public class part02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] tot = new int[3]; 
		int[] avg = new int[3];
		
		
		for(int i=0;i<3;i++) {
			System.out.println("name:");
			name[i] = sc.next();		
			System.out.println("kor:");
			kor[i]= sc.nextInt();
			System.out.println("eng:");
			eng[i]=sc.nextInt();
			tot[i]=kor[i]+eng[i];
			avg[i]=tot[i]/2;
		}
		System.out.println("이름\t"+"국어\t"+"영어\t"+"총점\t"+"평균\t");
		for(int i =0;i<3;i++) {
		System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+tot[i]+"\t"+avg[i]);
			
		}
		
	
	}

}
