package javaExamples;

public class Keywords1 {
public static void main(String args[]) {
	for(int i=1; i<=10; i++)
	{
		if(i==6)
			break;  //it'll only print the no. upto 6 & not 6 it'll breaak the loop when it'll come to 6.
		System.out.println(i);
	}
}
}