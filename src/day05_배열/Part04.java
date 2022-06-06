package day05_배열;

public class Part04 {

	public static void main(String[] args) {
		int[] aa =new int[9];
		int[] bb = new int[9];
		System.out.println("aa");
		for(int i=0;i<9;i++) {
			System.out.print((i+1)+","+aa[i]);
			
		}
		System.out.println();
		System.out.println("bb");
		for(int i=0;i<9;i++) {
			System.out.print((9-i)+","+bb[i]);

		}

	}

}
