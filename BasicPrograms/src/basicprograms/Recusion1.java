/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprograms;

/**
 *
 * @author silverpanda
 */

class Factorial
{
    int fact(int n)
    {
        System.out.println("n:" + n);
        int result;
        if (n == 1)
        {
            return 1;            
        }
        
        result = n * fact(n-1);
        System.out.println("reesult : "+result);
        return result;
              
    }
    
}
public class Recusion1 {
    public static void main(String args[])
    {
        Factorial f = new Factorial();
        
        System.out.println("Factorial of 3 is : " + f.fact(3));
        System.out.println("Factorial of 4 is : " + f.fact(4));
        System.out.println("Factorial of 5 is : " + f.fact(5));
    }
}
