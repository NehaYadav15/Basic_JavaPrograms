package package_javabasics;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the first number");
		
		int a = s1.nextInt();
		System.out.println("enter the second number");
		int b= s1.nextInt();
		int sum=a+b;
		System.out.println("sum: "+  sum);
		//System.out.println(sum);
		s1.close();
		

	}

}
