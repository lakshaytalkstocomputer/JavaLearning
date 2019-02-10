package com.company;

import java.util.Scanner;

public class Fifth {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String data = Fourth.get_string(sc);

        char ch;

        System.out.println("Enter character whose occurence to find: ");
        ch = sc.next().charAt(0);
        int counter = 0;
        int len = data.length();
        for(int i = 0;i< len;i++)
        {
          if(ch == data.charAt(i))
          {
              counter += 1;
          }
        }

        System.out.println("Highest Occurence of "+ ch+ " = "+counter );
    }
}
