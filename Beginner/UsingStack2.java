/*
 * WAP to add numbers in Stack, check if number is even then only add in stack and then find sum 
 */
package Training;
import java.util.*;

public class UsingStack2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<>();
	    Scanner sc = new Scanner(System.in);
	    int sum= 0;
	   
	    System.out.println("Enter number to add and any character to stop adding: ");
	    while(sc.hasNextInt())
	    {
	    	int i = sc.nextInt();
	    	if(i % 2 == 0)
	    	{
	    		stk.push(i);
	    	}
	    }
	    
	    while(!stk.isEmpty())
	   {
	       sum += stk.pop();
	   }
	    System.out.println("Sumk of numbers in Stack = "+sum);
	    sc.close();

	}

}
