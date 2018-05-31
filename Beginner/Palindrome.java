import java.util.*;

class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number;
		int temp;
		int number2 = 0;
		int rem;
		System.out.println("Enter number to check whether it is palindrome or not: ");
		number = sc.nextInt();
		temp = number;
		while (number != 0)
		{
			rem = number % 10;
			number = number / 10;
			number2 = number2*10 + rem;
			 
		}
		
		if(number2==temp)
		{
		System.out.println("Palindrome Number");
		}
		else
		{
		System.out.println("Not a Palindrome number");
		}
	}
}
		