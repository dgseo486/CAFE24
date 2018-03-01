/*
 * 어디서 컴파일 오류가 발생하는지 찾으시오.
 */

package Exam;

interface A{
	public void color();
}

interface B extends A{
	public void color(String color);
}

public class Ex05 implements B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void color() {
		System.out.println("yellow");
		
	}

}
