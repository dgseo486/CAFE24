/*
 * 
 */

package Exam;

interface I1() {
	public void m1();
}

interface I2() {
	public void m2();
}

interface I3() extends I1, I2 {
	public void m3();
}

interface I4() {
	public void m4();
}

class C implements I3, I4 {
	
}

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
