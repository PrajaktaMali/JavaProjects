package javaExamples;

public class Dt_Var_bysuresh {
	int b=20; //instnce var
	static int empid = 101;
	   //non-staitc
	    public void m1() {
	    // DT Var  VV -- To Represent Data
	       int a = 10; //local var
	    System.out.println("M1 executed");
	    //               int      string
	    System.out.println(a + " Local Var");
	    System.out.println(empid + " static var");
	    }
	    public void m2() {
	        System.out.println("M2 executed");
	        System.out.println(b+" instance var");
	        System.out.println(empid+" static var");
	        }
	    public void m3() {
	        System.out.println("M3 executed");
	        System.out.println(b+" instance var");
	        }
	    //static method
	    public static void st() {
	    System.out.println("static method executed");
	    }
	public static void main(String args[]) {
	    System.out.println("main method executed");
	    //classname objectname = new classname();
	    Dt_Var_bysuresh m = new Dt_Var_bysuresh(); //non-static : access by using object
	    m.m1();
	    m.m2();
	    m.m3();
	    //static method
	    Dt_Var_bysuresh.st(); // accessing by using classname
	}
}
