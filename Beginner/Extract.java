/* WAP to extract digits from a String */
import java.util.*;
class Extract
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string are :");
		boolean space = false;
		String s1=sc.nextLine();
		/*
		for(int i=0;i<s1.length();i++)
		{
			System.out.println("CHAR AT "+i+" : "+s1.charAt(i));
			
			if((s1.charAt(i) >='0' && s1.charAt(i) <='9') || (s1.charAt(i) ==' ') )
			{
			continue;
			}
			else if((s1.charAt(i) >='a' && s1.charAt(i) <='z')||(s1.charAt(i) >='A' && s1.charAt(i) <='Z'))
			{
				s1=s1.replaceAll(String.valueOf(s1.charAt(i))," ");
				System.out.println(s1);
			}
			else 
			{
				s1=s1.replaceAll(String.valueOf(s1.charAt(i)),String.valueOf('*'));
				System.out.println(s1);
			}	
			
		} */
		s1 = s1.replaceAll("[^0-9]", "");
		System.out.println("New String = " +s1);
	}
}

