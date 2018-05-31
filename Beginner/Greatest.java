import java.util.*;

class Greatest
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
		int max =0;
		for(int i =0;i<10;i++)
		{
			if(max < data[i])
			{
				max = data[i];
			}
		}
		System.out.println("Maximum of Array = "+max);
		
	}
	
}