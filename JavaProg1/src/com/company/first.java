package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class first
{
    /*
       - ArrayList<Integer> , Scanner -> void
       - Function to enter data into Array from user
    */
    public static void fill_array(ArrayList<Integer> a, Scanner s)
    {
        System.out.println("Keep entering numbers and press any non numeric key when to finish :-  ");
        while(true)
        {
            try
            {
                a.add(s.nextInt());
            }
            catch(Exception e)
            {
               s.next();
               break;
            }
        }
    }

    /*
        - Integer -> boolean
        - Function to check whether given number is prime or not
    */
    public static boolean check_prime(Integer i)
    {
        Integer a = 2;
        while(a < i)
        {
            if(i%a == 0)
            {
                return false;
            }
            else
            {
                a = a + 1;
            }
        }
        return true;


    }

    /*
      - ArrayList<Integer> -> Integer
      - This function returns the sum of non prime numbers in the given array
    */
    public static Integer non_prime_sum(ArrayList<Integer> a)
    {
        Integer sum =0;

        for(Integer i : a)
        {
            if(!check_prime(i))
            {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        fill_array(arr,sc);

        System.out.println("Sum of all non prime number = " + non_prime_sum(arr));

    }
}
