package javaExamples;

public class NestedIf_Condition2 {
public static void main(String args[]) {
	int a=40;
if(a==40) {
	if(a==35+5) {
		if(a==25*2) {
			System.out.println("a value is 40 ");
		}
		else {
			System.out.println("a is not 40 for 25*2 3rd condition");
		}
		}
		else {
			System.out.println("a is 40 for 35+5 2nd condition");
		}
	}
	else {
		System.out.println("a is 40 for 40");
}
}
}
