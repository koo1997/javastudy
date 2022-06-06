package day07중첩클래스_중첩인터페이스;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F a = new F();
		a.S(new B());
		a.touch();
		a.S(new C());
		a.touch();
		
	}

}
