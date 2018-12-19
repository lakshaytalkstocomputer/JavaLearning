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
public class Stack {
    int stck[];
    int tos;
    
    //Initilaize top of the stack
    Stack()
    {
        System.out.println("Enter how many elements you want to enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        stck = new int[n];
        
        tos = -1;        
    }
    
    //Push an item onto the stack
    void push(int item)
    {
        if(tos == (stck.length - 1))
        {
            System.out.println("Stack is full.");
        }
        else
        {
            stck[++tos] = item;
        }
    }
    
    // Pop an item from the stack 
    int pop()
    {
        if(tos < 0)
        {
                   
            return -666;            
        }
        
        else
        {
            return stck[tos--];
        }
    }
}

class TestStack
{
    public static void main(String args[])
    {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        
        // push some number onto the stack
        for(int i=0; i <10; i++) myStack1.push(i);
        for(int i=10; i <20; i++) myStack2.push(i);
        
        // pop those num,ber off the stack
        System.out.println("Numbers in myStack1");
        int p;
        while((p = myStack1.pop()) != -666)
        {
            System.out.println(p);
        }
        
        
        System.out.println("Numbers in myStack2");
        while((p = myStack2.pop()) != -666)
        {
            System.out.println(p);
        }
        
        
    }
}
