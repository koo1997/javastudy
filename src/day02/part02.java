package day02;

public class part02 {

	public static void main(String[] args) {

		
		
		int v1 = 5;
		int v2 = 2;
		
		double b = (double) v1/v2;
		double c =  v1/v2;
		System.out.println(b);
		System.out.println(c);
		
		
			int sum1 = 0; // 짝수의합
			int sum2 = 0; //홀수의 합
			
			for(int i=1;i <= 100;i++) {
				if(i % 2 != 0) {//   != 값이 다를때 == 값이 같을때
					//짝수의합
					sum1 +=i;
				}else {
					//홀수의합
					//sum2 +=i;
					sum2 = sum2 +i;
				}
			}
			System.out.println("짝수의합 :" + sum1);
			System.out.println("홀수의합 :" + sum2);
			System.out.println("총합 :" + (sum1 +sum2));
		
	  double g = (double)10%0;
	  double e = (double)10/0;
	  System.out.println(g);
	  System.out.println(e);
	  
	  
	  System.out.println('A'==65);

		 
	}

}
