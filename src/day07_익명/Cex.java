package day07_익명;

public class Cex {

	public static void main(String[] args) {
		
		C c= new C();
		c.A();
		
		c.p.A();
		c.m1();
		c.m(
				new P() {
					void s() {
						System.out.println("s");
					}
					void A() {
						System.out.println("A4");
						s();
					}
				}
				);
	}

}
