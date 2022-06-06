package day07_익명;

public class C extends P{
	
	P p = new P() {
		void B() {
			System.out.println("B1");
		}
		
		void A() {
			System.out.println("A2");
			B();
		}
	};
	
	void m1() {
		P l = new P() {
			void B2() {
				System.out.println("B2");
			}
			void A() {
				System.out.println("A3");
				B2();
			}
			
			
			
		};
		
		l.A();
		
	}
	void m(P p) {
		p.A();
	}
	
	
	
}
