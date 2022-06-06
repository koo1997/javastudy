package day05_배열;

public class Part01 {

	public static void main(String[] args) {
		String[] name = {"홍길동","홍길순","호호호"};
		int[] jumsu = {100,70,80};
		int tot = 0;
		for(int i = 0; i  <3; i++) {
			System.out.println(name[i]+","+jumsu[i]);
			tot+=jumsu[i];
		}
		
		double avg = tot/3.0;
		System.out.println(avg);
		
		
		
		
		
	}

}
