package day06_클래스불러오기;

public class Part02Ex {

	public static void main(String[] args) {

		Part02 sum=new Part02();
		
		int[] a=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		
		
		int b=sum.sum1(a);
		int c=sum.sum2(a);
		System.out.println(b);
		System.out.println(c);
	}

}
