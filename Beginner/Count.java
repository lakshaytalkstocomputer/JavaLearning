/* WAP to count words in a string - Naive Approach */
import java.util.*;
class Count
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int word=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
		{
			word++;
		}
	}
	System.out.println("words are :"+word);
}
}

