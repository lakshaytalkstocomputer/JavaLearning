/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadingandnetworking;

/**
 *
 * @author silverpanda
 */
class Res1
{
    int n;
    boolean valueSet = false;
    
    public Res1()
    {
        n = 0; 
    }
    
    synchronized public void put(int i)
    {
        while(valueSet)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted Expcetion");
            }
            
        }
        this.n = i;
        valueSet = true;
        System.out.println("Put: " + i);
        notify();
    }
    
    synchronized public int get()
    {
        while(!valueSet)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("INterrupted Exception Caught. ");
            }
            
        }
        
        System.out.println("Get: " + n);
        valueSet = false;
        notify();
        return n;
    }
    
}

class Prod1 extends Thread
{
    Res1 r;
        
    public Prod1(Res1 q)
    {
        r =q;
    }
    
    public void run()
    {
        int i =0;
        while(true)
        {
            
            r.put(++i);
        }
    }
    
}

class Cons1 extends Thread
{
    Res1 r;
        
    public Cons1(Res1 q)
    {
        r =q;
    }
    
    public void run()
    {
        int i;
        while(true)
        {
            i = r.get();            
        }
    }
    
}
public class PRodConsUsingITC {
    public static void main(String args[])
    {
        // creating a resource
        Res1 r = new Res1();
        
        // Creating a Producer
        Prod1 p = new Prod1(r);
        
        // Creating a Consumer
        Cons1 c = new Cons1(r);
        
        p.start();
        c.start();
        
        
    }
    
}
