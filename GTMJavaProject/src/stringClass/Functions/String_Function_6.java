package stringClass.Functions;

public class String_Function_6 {

	public static void main(String[] args) 
	{
		String a="Manish Kumar Tiwari";
		boolean a1=a.contains("Manish");
		System.out.println(a1);
		System.out.println(a.contains("manish"));
		
		System.out.println(a.equals("manish kumar tiwari"));
		System.out.println(a.equalsIgnoreCase("manish kumar tiwari"));
		
		String name="rama Rai";
		System.out.println(name.matches("...."));
		System.out.println(name.matches("..."));
		System.out.println(name.matches("(.*)a"));
		System.out.println(name.matches("r(.*)"));
		System.out.println(name.matches("(.*)Rai(.*)"));
		
		String b="Rama Sai";
		System.out.println(b.matches("........"));
		System.out.println(b.matches("(.*)i"));
		System.out.println(b.matches("R(.*)"));
		System.out.println(b.contains(" "));
		System.out.println(b.matches("(.*)Sai(.*)"));

	}

}
