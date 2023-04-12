package javaExamples;
 class A {
int a=30;
int b=40;
public void m1() {
System.out.println("m1 executed");
}
}
 class B1  extends A{
int x=50;
int y=60;
public void m2() {
System.out.println("m2 executed");
System.out.println(a+b);
}
}
public class C extends B1{
public void m3() {
System.out.println("m3 executed");
System.out.println(x+y); //class B
System.out.println(a+b); //class A
}
public static void main(String args[]) {
    C  obj  =  new C();
    obj.m1();
    obj.m2();
    obj.m3();
}
}