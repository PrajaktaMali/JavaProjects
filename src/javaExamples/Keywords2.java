package javaExamples;

public class Keywords2 {
	public static void main(String args[]) {
		for(int i=1; i<=15; i++)
		{
			if(i==8)
				continue; //it'll print break currunt process and print from next level
			System.out.println(i);
		}
	}
}