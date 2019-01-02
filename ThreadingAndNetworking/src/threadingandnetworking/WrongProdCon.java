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
class Res
{
    int n;
    public Res()
    {
        n = 0; 
    }
    
    synchronized public void put(int i)
    {
        System.out.println("Put: " + i);
        n= i;
    }
    
    synchronized public int get()
    {
        System.out.println("Get: " + n);
        return n;
    }
    
}

class Prod extends Thread
{
    Res r;
        
    public Prod(Res q)
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

class Cons extends Thread
{
    Res r;
        
    public Cons(Res q)
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
public class WrongProdCon {
    
    public static void main(String args[])
    {
        // creating a resource
        Res r = new Res();
        
        // Creating a Producer
        Prod p = new Prod(r);
        
        // Creating a Consumer
        Cons c = new Cons(r);
        
        p.start();
        c.start();
        
        
    }
    
}
