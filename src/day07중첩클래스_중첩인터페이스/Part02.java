package day07중첩클래스_중첩인터페이스;

public class Part02 {

	public static void main(String[] args) {
		
		Part01 p = new Part01();
		Part01.A a= p.new A(); //인스턴스
		a.method();
		Part01.B b= new Part01.B();//정적 
		b.method();
		p.method();
		
		
	}

}
