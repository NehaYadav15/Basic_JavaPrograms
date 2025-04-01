package scanner_class_programs;
import java.util.Scanner;

public class Scanner_Class_Introduction 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s1.nextInt();
		System.out.println("Enter your name");
		String name=s1.next();
		System.out.println("This is your age: "+age+" and this is your name: "+name);
		s1.close();
		
		
		
		

	}

}
