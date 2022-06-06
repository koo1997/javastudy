package day07중첩클래스_중첩인터페이스;


public class F{
	

A i;
void S(A i) {
	this.i=i;
}
void touch() {
	i.on();
}
interface A {
	void on();

}
}