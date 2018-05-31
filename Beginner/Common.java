import java.util.*;

class Common
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
		int data1[] = new int[10];
		int data2[] = new int[10];
		int commondata[] = new int[10];
		int count = 0;
		for (int i =0;i<10;i++)
		{
			System.out.println("Enter element in a first array at index "+i+" of array 1 : ");
			data1[i] = sc.nextInt();
		}
		for (int i =0;i<10;i++)
		{
			System.out.println("Enter element in a second array at index "+i+" of array 2 : ");
			data2[i] = sc.nextInt();
		}
		for(int i =0;i<10;i++)
		{
		   for(int j =0;j<10;j++)
		   {
			   if(data1[i] == data2[j])
			   {
				   commondata[count] = data1[i];
				   ++count;
			   }
		   }
		}
		System.out.println("Common Elements are : ");
		for(int i = 0;i<10;i++)
		{
			if(commondata[i] != 0 && i<= 9)
			{
			System.out.print(commondata[i]);
			}
			else if(commondata[i] != 0)
			{
			System.out.print(commondata[i]+",");
			}
		}
				
	}
	
}