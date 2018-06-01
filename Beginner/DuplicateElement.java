package Training;

import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[10];
		int i = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number to add and any character to stop adding: ");
		    while(i<10)
		    {
		    	arr[i]=sc.nextInt();
		    	i = i+1;
		    }
		    
		    for(int k = 0; k<arr.length; k++)
		    {
		    	for(int j=k+1;j<arr.length;j++)
		    	{
		    		if(arr[j] == arr[k])
		    		{
		    			System.out.println("Duplicate Elements is "+arr[k]+" ar index "+k+" and "+j);
		    		}
		    	}
		    }
		    sc.close();

	}

}
