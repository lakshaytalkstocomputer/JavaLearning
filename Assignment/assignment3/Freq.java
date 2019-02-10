// prinbt the factorial of Lasrgest number in th egiven number
import java.util.Scanner;
class Freq
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
        int len = str.length(); 
		
	    int arr[][] =  new int[26][2];

	    for (int i = 0 ;i<len;i++)
	    {
	    	int alpha ;
	    	alpha = (int) str.charAt(i);
	    	if (alpha>= 65 && alpha<=90)
	    	{
	    		arr[alpha-65][0] = (int)alpha;
	    		arr[alpha-65][1] += 1;
	    	}
	    	else if(alpha>= 97 && alpha <= 122 )
	    	{
	    		
	    		arr[alpha-97][0] = (int)alpha;
	    		arr[alpha-97][1] += 1;
	     	}
	    }
	    int max=0;
	    char maxc = str.charAt(0);

	    for (int i = 0;i<26;i++)
	    {
	    	if(max<arr[i][1])
	    	{
	    		max = arr[i][1];
	    		maxc = (char)arr[i][0]; 
	    	}
	    	
	    
	    }
		
	for (int i = 0; i <26; i++)
	{
	    System.out.print((char)arr[i][0]+":");
	    System.out.println(arr[i][1]);
    
	}

	    System.out.println("Max : "+max);
	    System.out.println("Maxc : "+maxc);


		

	}
	
}
