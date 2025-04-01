package stringClass.Functions;
public class String_Functions 
{

	public static void main(String[] args) 
	{
         String firstname="Laxman";
         String fullname=firstname.concat("Rai").concat("Hari");
         System.out.println(fullname);
         System.out.println(firstname);
         
         StringBuffer n1=new StringBuffer("Ritu");
         StringBuffer n2=n1.append(" Sharma").append(" Prasad");
		 System.out.println(n1);
		 System.out.println(n2);
		 
		  //StringBuffer n3="Neha";
		 //Cannot write like this. Syntax error.
		 
		 StringBuilder s1=new StringBuilder("Mohit");
	     StringBuilder s2= s1.append(" Tiwari");
	     System.out.println(s2);
	     System.out.println(s1);
	}

}
