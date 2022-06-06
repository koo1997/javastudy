package day04;
import java.util.Scanner;
public class part02 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int min;
	int max;
	System.out.println("초기");
	min = sc.nextInt();
	System.out.println("최종");
	max = sc.nextInt();
	int su=0;
	int su1=0;
		while(min<=max) {
			if(min%2==0) {
				su+=min;
			}else {
				su1+=min;
			}
			min++;
		}
	System.out.println(su);
	System.out.println(su1);
	
	}
}
