package javaExamples;

public class Datatype_Variables {
	//DT Var = Variable value -----to represent data
	int a=100 ;          //instance variable
			static int empid =199;       //static variable
	public void m1() {
		//DT Var = Variable value -----to represent data
		int b=200;              //local variable
    System.out.println("M1 executed");
                       // int + string 
    System.out.println(b+" local variable");
    System.out.println(empid+ " empid");
	}
	public void m2() {
		//DT Var = Variable value -----to represent data
		int c=300;
		System.out.println("M2 exexcuted");
		System.out.println(c+" local variable");
		System.out.println(empid+ " empid" );
	}
	public void m3() {
		//DT Var = Variable value -----to represent data
		int d=400;
		System.out.println("M3 executed");
		System.out.println(d+ " local variable");
		System.out.println(empid+ " empid");
	}
	   //static method 
	public static void st() {
		System.out.println("static method executed");
	}
	public static void main(String args[]) {
	System.out.println("Main method executed");
	// classname objectname = new classname();
	Datatype_Variables method = new Datatype_Variables(); //nonstatic ----accessing using objects
	method.m1(); 
	method.m2();
	method.m3();
	Datatype_Variables.st();     //accessing by using classname
	   
	
}
}
