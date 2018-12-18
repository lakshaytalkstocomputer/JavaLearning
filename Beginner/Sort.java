import java.util.*;

class Sort
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
		int data[] = new int[10];
		int min = 0;
		int index = 0;
		for (int i =0;i<10;i++)
		{
			System.out.println("Enter element in a index "+i+" of array : ");
			data[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 10;i++)
		{
			for(int j = 0;j< 10;j++)
			{
				if(data[j] > data[i])
				{
					min = data[j];
					data[j] = data [i];
					data[i] = min;	
				}
				
			}
		}
		System.out.println();
		for (int i =0;i<10;i++)
		{
			System.out.println(data [i] + " ");			
		}
	}
	
}