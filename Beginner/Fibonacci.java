import java.util.*;

class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number; 
		System.out.println("Enter term upto where Fibonacci sequence is to be found :");
		number = sc.nextInt();
		int fibonacci = 0;
		int fibonacci1 = 1;
		int temp = 0;
		for(int i = 0;i<number;i++)
		{
		  if(i == (number-1))
		  {
		  System.out.print(fibonacci);
		  //temp = fibonacci1;
		  //fibonacci1 = fibonacci1 + fibonacci;
		  //fibonacci = temp;
		  }
		  else
		  {
		  System.out.print(fibonacci+", ");
		  temp = fibonacci1;
		  fibonacci1 = fibonacci1 + fibonacci;
		  fibonacci = temp;
		  }
		}
	}
}
	