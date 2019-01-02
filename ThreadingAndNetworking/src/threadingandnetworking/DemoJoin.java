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
class DemoThread implements Runnable
{
    String name; // name of the thread
    Thread t;
    
    DemoThread(String threadName)
    {
       this.name = threadName;
       t = new Thread(this, name);
        System.out.println("New Thread: " + t);
    }

    @Override
    public void run() {
    try 
    {
        for(int i =5;i > 0 ;i--)
        {
            System.out.println(name + ": " + i);
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println(name + " interreupted.");
    }
    
    }
    
}
public class DemoJoin {
    public static void main(String args[])
    {
        DemoThread nt1 = new DemoThread("First");
        DemoThread nt2 = new DemoThread("Second");
        DemoThread nt3 = new DemoThread("Third");
        
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        
        System.out.println("Thread " + nt1.name + " is alive: " +nt1.t.isAlive());
        System.out.println("Thread " + nt2.name + " is alive: " +nt2.t.isAlive());
        System.out.println("Thread " + nt3.name + " is alive: " +nt3.t.isAlive());
        
        try
        {
            System.out.println("Waiting for the threads to finish. ");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
            
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread Interrupted");
            
        } 
        
        System.out.println("Thread " + nt1.name + " is alive: " +nt1.t.isAlive());
        System.out.println("Thread " + nt2.name + " is alive: " +nt2.t.isAlive());
        System.out.println("Thread " + nt3.name + " is alive: " +nt3.t.isAlive());
        
        Thread a = Thread.currentThread();
        
        System.out.println("Thread " + a.getName() + " is alive: " +a.isAlive());
        
        System.out.println("Main Thread is Exiting.");
           
        
        
    }
    
}
