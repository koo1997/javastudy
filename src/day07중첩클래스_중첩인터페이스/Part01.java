package day07중첩클래스_중첩인터페이스;

public class Part01 {
	
	class A{
		A(){
			System.out.println("A");
		}
		void method() {}
		
		
	}
	
	static class B{
		B(){
			System.out.println("B");
		}
		void method() {}
	}
	void method() {
		class C{
			C(){
				System.out.println("C");
			}
			int f1;
			void method1(){}
		}
		C c= new C();
		c.f1=3;
		c.method1();
		
	}
	
	
	
	

}
