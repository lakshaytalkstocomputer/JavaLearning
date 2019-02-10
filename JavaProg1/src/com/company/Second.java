package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Second
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        // filling array with numbers form user
        first.fill_array(arr, sc);

        // sorting the given array
        arr.sort(Comparator.naturalOrder());

        //arr.forEach(System.out::println);

        // print kth smallest number
        int k;
        System.out.println("Enter value of k : ");
        k = sc.nextInt();
        if(k < arr.size())
        {
            System.out.println(k + "th smallest number is : "+ arr.get(k-1));
        }
        else
        {
            System.out.println("Array does not contain that many values.");
        }
    }
}
