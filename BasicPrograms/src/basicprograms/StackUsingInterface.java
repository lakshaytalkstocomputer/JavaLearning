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

interface IntStack
{
    void push(int item); // store an item
    int pop(); // retrieve an item
}

class FixedStack implements IntStack
{
    private int stck[];
    private int tos;
    
    FixedStack(int size)
    {
        stck = new int[size];
        tos = -1;
    }
    
    @Override
    public void push(int item) {
        if(tos == stck.length-1)
        {
            System.out.println("Stack is Full.");
        }
        else
        {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if(tos<0)
        {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
        return stck[tos--];
    }
    
}

class DynStack implements IntStack
{
    private int stck[];
    private int tos;
    
    DynStack(int size)
    {
        stck = new int[size];
        tos = -1;
    }
    
    @Override
    public void push(int item) {
        // if stack is full, allocate a larger stack
        if(tos ==stck.length -1)
        {
            int temp[] = new int[stck.length * 2];
            System.arraycopy(stck, 0, temp, 0, stck.length);
            stck = temp;
            stck[++tos] =item;
        }
        else
            stck[++tos] = item;
    }

    @Override
    public int pop() {
        if(tos<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
    
}

public class StackUsingInterface {
    public static void main(String args[])
    {
        /*
         Testing Fixed Stack
        */       
        
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        
        for(int i =0; i<5; i++) mystack1.push(i);
        for(int i =0; i<8; i++) mystack2.push(i);
        
        System.out.println("Stack in mystack1: ");
        for(int i =0; i<5;i++)
        {
            System.out.println(mystack1.pop());
            
        }
        
        System.out.println("Stack in mystack2: ");
        for(int i =0; i<8;i++)
        {
            System.out.println(mystack2.pop());
            
        }
        
        /*
         Testing Dynamic Stack
        */       
        
        DynStack mystack3 = new DynStack(5);
        DynStack mystack4 = new DynStack(8);
        
        for(int i =0; i<12; i++) mystack3.push(i);
        for(int i =0; i<20; i++) mystack4.push(i);
        
        System.out.println("Stack in mystack3: ");
        for(int i =0; i<12;i++)
        {
            System.out.println(mystack3.pop());
            
        }
        
        System.out.println("Stack in mystack4: ");
        for(int i =0; i<20;i++)
        {
            System.out.println(mystack4.pop());
            
        }
    }
    
}
