package day02;

import java.util.Iterator;

public class test01 {

	public static void main(String[] args) {

		
		int a = 12%5;
		System.out.println(a);
		
		int j = 2;
		 int g = 1;
		for(int i=0;i<10;++i) {
			System.out.println("j"+ j);
			System.out.println(i);
			g=i+1;
			j++;
		}
		System.out.println(g);
		
		
		int v1 = 5;
		int v2 = 2;
		
		double b = (double) v1/v2;
		double c =  v1/v2;
		System.out.println(b);
		System.out.println(c);
		
		var sum = 0; // 합계를 저장할 변수
		   int     k   = 1; // 카운터 변수
		while(k <= 10) {
		    sum += k;
		    k++;
		}
		System.out.println("1 ~ " + (k-1) + " 합은 " + sum);

//alt + shift + r
		
		
		
		
	}

}
