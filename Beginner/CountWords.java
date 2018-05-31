import java.util.*;

class CountWords
{
public static void main(String args[])
{
	boolean wordIn = false;
	int wordCount = 0;	
	Scanner sc = new Scanner(System.in);
	String str;
	System.out.println("Enter String : ");
	str = sc.nextLine();
	for(int i =0;i<str.length();i++)
	{
		if(str.charAt(i) != ' ' && wordIn == false)
		{
			wordIn = true;
			wordCount = wordCount + 1;
			
		}
		else if(str.charAt(i) == ' ')
		{
			wordIn = false;
		}
	}
	System.out.println("No of words = " + wordCount);
		
		
	
}
}
