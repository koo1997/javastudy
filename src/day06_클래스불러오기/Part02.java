package day06_클래스불러오기;

public class Part02 {
	
	
	int sum1(int[] v) {
		int sum=0;
		for(int i=0;i<v.length;i++) {
			if(v[i]%2==0) {
				sum+=v[i];
			}
		}
		return sum;
	}
	
	int sum2(int[] v) {
		int sum=0;
		for(int i=0;i<v.length;i++) {
			if(v[i]%2!=0) {
				sum+=v[i];
			}
		}
		return sum;
	}
	
	

}
