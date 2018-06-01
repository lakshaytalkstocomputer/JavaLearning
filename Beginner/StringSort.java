/* WAP to sort strings in array */
package Training;

import java.util.*;

public class StringSort 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] str = new String [10];
		String temp;
		System.out.println("enter 10 Strings to sort: ");
		for(int i =0; i<10; i++)
		{
			str[i] = sc.nextLine();
		}
		for(int i = 0; i < 10;i++)
		{
			for(int j = 0;j< 10;j++)
			{
				if(str[j].compareTo(str[i]) > 0)
				{
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;	
				}
				
			}
        }
		
		System.out.println("\nSorted String is : ");
		for(int i =0; i<10; i++)
		{
			System.out.println(str[i]);
		}
		sc.close();
	}
	

}
