package day04;

public class part01 {

	public static void main(String[] args) {

		
		int min=200;
		int max=1;
		
		for(int i=1;i<=100;i++) {

			if (i>=max) {
				min=i;
			}if(i<=min) {
				max=i;
			}
		}
		System.out.println("최대"+min);
		System.out.println("최소"+max);
		
		String b="";
		for(int a = 1;a<=5;a++) {
			b+="*";
			System.out.println(b);
		}
		
	}

}
