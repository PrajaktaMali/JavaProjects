package javaExamples;
import java.util.Scanner;
public class Exp_Addition {
	public static void main(String args[]) {
		int a,b,c;
		System.out.println("enter a&b value");
		Scanner object = new Scanner(System.in);
		a = object.nextInt();
	    b = object.nextInt();
		c=a+b;
		System.out.println("Addition of two nos." + c);
		
	}
}