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
class NewThread1 extends Thread
{
    NewThread1()
    {
        super("Demo Thread");
        System.out.println("Child Thread: "+ this);
    }
    
    // This is the netry point for the second thread
    public void run()
    {
        try 
        {
            for(int i =5; i > 0 ;i--)
            {
                System.out.println("Child Thread : "+ i);
                Thread.sleep(500);
                
            }
            
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Interrupted. ");
        }
        
        System.out.println("Exiting child thread.");
    }
}

public class CreateThreadUsingThread {
    public static void main(String args[])
    {
        NewThread1 nt = new NewThread1();
        
        nt.start();
        
        try
        {
            for(int i =5; i> 0;i--)
            {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
            
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interreupted.");
        }
        System.out.println("Main thread exiting");
    }
}
