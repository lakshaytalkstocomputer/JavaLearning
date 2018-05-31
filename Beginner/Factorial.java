/* WAP to find factorial of a number */

import java.util.*;

class Factorial
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
		int number; 
		System.out.println("Enter number whoose factorial is to be found :");
		number = sc.nextInt();
		int factorial = 1;
		for(int i = number;  i> 0; i--)
		{			
		 factorial = factorial * i;
		}
		System.out.println("Factorial = " + factorial);
	}
	
}
