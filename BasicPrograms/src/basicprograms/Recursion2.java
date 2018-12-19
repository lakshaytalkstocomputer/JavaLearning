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
class RecTest
{
    int values[];
    
    RecTest(int i)
    {
        values = new int[i];       
    }
    
    // display array -- recursively
    void printArray(int i)
    {
        if (i ==0)
            return ;
        else 
            printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);    
    }
}

public class Recursion2 {
    public static void main(String args[])
    {
        RecTest ob = new RecTest(10);
        int i;
        
        for(i=0; i<10; i++)
        {
            ob.values[i] = i+1;
        }
        
        ob.printArray(ob.values.length);
    }
}
