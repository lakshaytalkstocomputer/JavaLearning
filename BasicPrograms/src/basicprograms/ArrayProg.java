/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprograms;

import java.util.Scanner;

/**
 *
 * @author silverpanda
 */
public class ArrayProg {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);   
        //oneDArray(sc);
        multiDArray(sc);
    }
    
    public static void oneDArray(Scanner b)
    {
        // Intilizing Scanner scanner object to get input
        
        
        // Length of array from user
        System.out.println("Enter length of array : ");
        Integer n = b.nextInt();
        
        //Initilizing array with user specifed array
        Integer arr[] = new Integer[n];
        
        int j;
        int i;
        
        //Entering data in array
        for(i = 1, j =0; j<arr.length; i++, j++)
        {
          arr[j] =i;   
        }
        
        // Printing the data
        for(int a : arr)
        {
            System.out.println(a);
                    
        }
        
    }
    
    public static void multiDArray(Scanner b)
    {
        //2D Array Square
        System.out.println("Enter number of Rows (= No. of columns): ");
        int m = b.nextInt();          
        int twoD [] [] =new int[m][m];
        twoDArr(twoD);
        
        //2D Array Table
        System.out.println("Enter number of Rows : ");
        int x = b.nextInt();
        System.out.println("Enter number of columns: ");
        int y = b.nextInt();
        
        int twoDtab[][] =new int[x][y];
        twoDArr(twoDtab);
        
        //2D Array Iregular
        System.out.println("Enter number of Rows : ");
        int g = b.nextInt();
        
        int[][]  twoDirr = new int[g][];
        
        for (int i=0;i<twoDirr.length; i++)
        {
            System.out.println("Enter number of columns : ");
            int h = b.nextInt();
            
            twoDirr[i] = new int[h];
        }
        twoDArr(twoDirr);
        
        
        
        
    }
    public static void twoDArr(int [][] arr )
    {
        int q,w;
        int e =1;
        
        for(q =0; q<arr.length; q++)
        {
            
            for(w =0; w<arr[q].length; w++)
            {
                arr[q][w] = e;
                ++e;
            }
        }
        
        for(int[] row: arr)
        {
            for(int d: row)
            {
                System.out.print(d + " ");
                
            }
            System.out.println("");
        }
        
    }
}
