/* WAP to input number in Vector and then transfer those numbers into array using for each */


package Training;
import java.util.*;

public class VectorToAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		Vector<Integer>  vec = new Vector<>();
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("Enter number to add and any character to stop adding: ");
	    while(sc.hasNextInt())
	    {
	    	vec.addElement(sc.nextInt());    	
	    }
	    
	    int[]  arr = new int[vec.size()];
	    
	    for(int element: vec)
	    {
	    	arr[i] = element;
	    	i =i+1;
	    }
	    
	    System.out.println("Elementsa in your array are : ");
	    for (int j = 0; j<arr.length;j++)
	    {
	    	System.out.println("Element at " + j+ " is " + arr[j]);
	    }
	    
	    
        sc.close();
	}

}
