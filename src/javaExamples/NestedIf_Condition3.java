package javaExamples;

public class NestedIf_Condition3 {
	public static void main(String args[]) {
		int a=50;
	if(a==50) {
		if(a==35+5) {
			 System.out.println("a value is 40");
		}
		else {
			System.out.println("a value is not 40 for 35+5 2nd condition");
		}
	}
	else {
		System.out.println("a value is not 40 for 1st condition");
	}
}
}