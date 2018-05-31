import java.util.*;

class table
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
		int number; 
		System.out.println("Enter number whoose table is to be found :");
		number = sc.nextInt();
		for(int i = 1;  i<= 10; i++)
		{			
		System.out.println(number + " x " + i+ " = " + (number*i));
		}
	}
	
}