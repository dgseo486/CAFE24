package Exam;

class A{
	public void a(int x) {
		System.out.println(x);
	}
	
	public void a(double y) {
		System.out.println(y);
	}
}

class B extends A {
	void a(int x) {
		System.out.println(x);
	}
	
	void b() { }
}

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.a(1);
		obj.a(1.0);
		//obj.b(1);
	}

}
