import java.util.*;

class sumInput
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
		int data[] = new int[10];
		for (int i =0;i<10;i++)
		{
			System.out.println("Enter element in a index "+i+" of array : ");
			data[i] = sc.nextInt();
		}
		int sum =0;
		for(int i =0;i<10;i++)
		{
		sum = sum +data[i];
		}
		System.out.println("Sum of integers = "+sum);
		
	}
	
}