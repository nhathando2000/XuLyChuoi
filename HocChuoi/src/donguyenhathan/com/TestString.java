package donguyenhathan.com;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1= new String("a");
		String b1= "a";
		
		String a2= new String("a");
		String b2= new String("a");
		
		String a3="a";
		String b3="a";
		
		String[] a4= {"a", "b"};
		String[] b4=a4;
		
		System.out.println(a1==b1); // false
		System.out.println(a2==b2); // true
		System.out.println(a3==b3); //true
//1,234,567,890
		
		
	}

}
