package day04;
import java.util.Scanner;
public class part04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= new int[5];
		int a1=0;
		int a2=200;
		int tot=0;
		
		for(int i =0;i<5;i++) {
			System.out.println("a["+(i+1)+"]");
			a[i]=sc.nextInt();
			tot+=a[i];
			if(a[i]>=a1) {
				a1=a[i];
			}if(a[i]<=a2) {
				a2=a[i];
			}
			
		}
		double avg = (double)tot/5;
		System.out.println("총"+tot);
		System.out.println("평"+avg);
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
//		for(int i =0;i<5;i++) {
//			System.out.println("a["+(i+1)+"]"+a[i]);
//		}
		
		
		
	}

}
