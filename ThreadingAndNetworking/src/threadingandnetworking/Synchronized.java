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
class Callme1
{
    synchronized void call(String msg)
    {
        System.out.print("[" + msg);
    
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
        System.out.println("Interrupted");
    }
        System.out.println("]");
    }
}

class Caller1 implements Runnable
{
    String msg;
    Thread t;
    Callme1 target;
    public Caller1(Callme1 targ, String s)
    {
        target = targ;
        msg = s;
        t = new Thread(this);
    }
    
    public void run()
    {
        target.call(msg);
    }
    
        }


public class Synchronized {
    public static void main(String args[])
    {
        Callme1 target = new Callme1();
        Caller1 ob1 = new Caller1(target, "Hello");
        Caller1 ob2 = new Caller1(target, "Synchronised");
        Caller1 ob3 = new Caller1(target, "World");
        
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        
        // wait for thread to end
        try 
        {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e)
            
        {
            System.out.println("Interrupted");
        }
    }
}
