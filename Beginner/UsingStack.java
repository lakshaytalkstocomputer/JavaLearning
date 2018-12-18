/* WAp to implemetn Stack from java.util package */
package Training;
import java.util.*;

public class UsingStack 
{
	public static void main(String args[])
	{
	Stack<Integer> mystack = new Stack<>();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number to put into stack and any character when you want to stop.");
	
	while(sc.hasNextInt())
	{
		mystack.push(sc.nextInt());		
	}
	
	System.out.println("Popping elements from Stack : ");
	while(!mystack.isEmpty())
	{
		System.out.println(mystack.pop());
	}
	sc.close();
	}
}
