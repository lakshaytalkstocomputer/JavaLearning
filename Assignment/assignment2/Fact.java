// prinbt the factorial of Lasrgest number in th egiven number
import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter number :");
		Integer i = sc.nextInt();

		int a = 0 ;
		int max= 0 ;
		while(i!=0)
		{
			a = i%10;
			i = i/10;

			if (a>max)
			{
				max = a;
			}
		}
		System.out.println("Factorial of lasrgest number : "+fact(max));


	}

	public static int fact(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else 
		{
			return n*fact(n-1);
		}
	}
}