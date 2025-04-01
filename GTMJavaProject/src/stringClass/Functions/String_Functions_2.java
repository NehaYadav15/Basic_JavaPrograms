package stringClass.Functions;

public class String_Functions_2 
{

	public static void main(String[] args) 
	{
		String name="Neha";
		int size=name.length();// Length function gives the size of string.
		System.out.println(size);
		String n1=name.concat(" Yadav").concat(" Yadav");//Concat is used to concat with the string.
		System.out.println(n1);
		System.out.println(name);
		//Concept of String is immutable in nature.Immutabe means that dosn't change.
//This string is never disturbed, we created a new string.		
		StringBuffer n2=new StringBuffer("Samosa");
		StringBuffer n3=n2.append(" Singh");
		System.out.println(n2);
		System.out.println(n3);
		
		StringBuffer n4=new StringBuffer("Kachori");
		n4.append(" Rai"); 
		System.out.println(n4);
		//Concept of StringBuffer is mutable.
		//Mutable means anything which can change or 
		//Behavior of changing and can become a new thing.
		
		StringBuilder n5=new StringBuilder("Jalebi");
		n5.append(" Sharma");
		System.out.println(n5);
		//Mutable in nature.
		//All 3 String, StringBuffer and StringBuilder comes from java.lang package.
		//No need to import java.lang package.
		
		//charAt() function
		String n="Automation Testing";
		char a=n.charAt(5);
		System.out.println(a);
		
		//toUpperCase() and toLowerCase() functions
	    String b=n.toUpperCase();
	    System.out.println(b);
	    System.out.println(n.toLowerCase());
	    
	    //trim() function
	    String c="I am Ram";
	    String c1=c.trim();
	    System.out.println(c1);
	    System.out.println(c);
	    String c2="       I am Ram         ";
	    String c3=c2.trim();
	    System.out.println(c2);
	    System.out.println(c3);
	    
	    //substring(startIndex)and substring(startIndex, endIndex) functions
	    String name2="Neha Yadav";
	    System.out.println(name2.substring(0));
	    System.out.println(name2.substring(1,10));
	    
	    //indexofchar() function
	    String n6="Neha Yadav";
	    int k=n6.indexOf('Y');
	    System.out.println(k);
	    
	    //indexofstring() function
	    String n7=" Rama Rai ";
	    System.out.println(n7.indexOf("m"));
	    
	    //isempty() function
	    System.out.println(n7.isEmpty());
	    
	    //replace(char a,char b) and replace(charSequence a,charSequence b) function
	    System.out.println(n7.replace('a', 'i'));
	    System.out.println(n7.replace("Rai", "Sharma"));
	    
	    //repeat() function
	    System.out.println(n7.repeat(8));

	}

}
