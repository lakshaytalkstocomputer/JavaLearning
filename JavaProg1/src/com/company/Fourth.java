package com.company;

import java.util.Scanner;

public class Fourth {
    /*
        - This function get input from user and return string
        - Scanner -> String
     */
    public static String get_string(Scanner a)
    {
        String s = "";
        System.out.println("Enter Text: ");

        while(a.hasNextLine())
        {
            s = s+ "\n"+ a.nextLine();
        }

        return s;
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       String data = get_string(sc);

       int words , spaces ,sentences ,dots;
       words = spaces = sentences = dots = 0;

       boolean in_word = false;
       boolean in_sentence = false;

       char ch ;
       int len = data.length();
       for(int i = 1; i< len; i++)
       {
           ch = data.charAt(i);

           if(ch == '.' )
           {
               dots += 1;
           }

           if( ch == ' ')
           {
               spaces += 1;
           }

           if(ch == '\n' || ch == '.' || ch ==' '|| ch =='\t'|| ch==','|| ch=='?'|| ch==':'||ch =='!' )
           {
               if((ch == '.' || ch =='\n'|| ch==','|| ch=='?'|| ch==':' || ch =='!') && in_word == true)
               {
                   sentences +=1;
               }
               in_word = false;
               in_sentence = false;
           }
           else if(in_word == false)
           {
               in_word = true;
               words += 1;
           }
       }

    System.out.println("Spaces: " + spaces);
        System.out.println("dots: " + dots);
        System.out.println("words: " + words);
        System.out.println("Sentences: " + sentences);


    }

}
