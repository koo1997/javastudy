package day01;

public class part03 {

	public static void main(String[] args) {

		
		int o = -1;
		int f = 1;
	
		int a = 1;
		char e;
		
		if (a>20) {
			e = '불';
		}else {
			e = '합';
					
		}
		System.out.println(e);
		
		int g = 0;
		for (int i = 0; i <=10; i++ ) {
			
				g = g + i;
		}
		
		System.out.println("1에서 10까지합 :"+g);
		
		
		if ((o<0) || (f<0) || (o>10) || (f>10)) {
			System.out.println("불합격");
		}else {							//  ||맞으면 맞는거
			System.out.println("합격");
		}
		
		if ((o>=0) && (f>=0) && (o<=10) && (f<=10)) {
			System.out.println("합격");
		}else {							// && 하나라도 틀리면 틀린거
			System.out.println("불합격");
		}
		
		
		
		
	}

}
