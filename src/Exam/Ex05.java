/*
 * ��� ������ ������ �߻��ϴ��� ã���ÿ�.
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
