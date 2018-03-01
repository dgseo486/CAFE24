/*
 * 출력될 값을 쓰시오.
 */

package Exam;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.remove("B");
		arr.add("D");
		arr.add("A");
		arr.remove("A");
		
		for(String a : arr) {
			System.out.println(a);
		}
	}

}
