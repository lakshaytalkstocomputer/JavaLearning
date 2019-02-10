package com.company;

import java.util.Scanner;

public class Sixth {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String data = Fourth.get_string(sc);

        System.out.println("Enter word which you want to find: ");
        String f = sc.next();

        if(data.toLowerCase().indexOf(f.toLowerCase()) != -1)
        {
            System.out.println("Found");
        }

        else
        {
            System.out.println("Not Found");
        }
    }
}
