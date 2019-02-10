package com.company;

import java.util.Scanner;

public class Seven {

    public static void matrix_filler(int[][] a, Scanner s)
    {
        System.out.println("Enter Data in Matrix : ");
        for(int i =0; i<a.length ;i++)
       {
           for(int j =0; j<a[0].length;j++)
           {
               a[i][j] = s.nextInt();
           }
       }
    }

    public static void multiply(int[][] first, int[][] second, int[][]res)
    {
        for(int i =0;i<res.length;i++)
        {
            for(int j= 0; j<res[0].length;j++)
            {
                for(int k = 0; k<second.length;k++)
                {
                    res[i][j] += first[i][k] * second[k][j];
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of a Matrice: ");

        System.out.println("Enter rows of matrice A: ");
        int row = sc.nextInt();
        System.out.println("Enter cols of matrice A: ");
        int cols = sc.nextInt();

        int[][] a = new int[row][cols];

        System.out.println("Enter rows of matrice B: ");
         row = sc.nextInt();
        System.out.println("Enter cols of matrice B: ");
         cols = sc.nextInt();

        int[][] b = new int[row][cols];

        if(a[0].length != b.length)
        {
            System.out.println("Sorry no Multiplication.");
        }
        else
        {
            int[][] c = new int[a.length][b[0].length];
            matrix_filler(a,sc);
            matrix_filler(b,sc);
            multiply(a,b,c);

            for(int[]r: c)
            {
                for(int col: r)
                {
                    System.out.print(col+" ");
                }
                System.out.println();
            }

        }
    }
}

