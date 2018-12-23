/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadingandnetworking;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

/**
 *
 * @author silverpanda
 */

class NewThread implements Runnable
{
    Thread t;
    
    NewThread()
    {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
    }
    
    // This is the entry point
    @Override
    public void run() {
        try 
        {
            for(int i = 5; i>0 ;i--)
            {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }               
        }
        catch (InterruptedException e)
        {
            System.out.println("Child Interrupted");
        }
        
        System.out.println("Exitign child thread.");
    }
}
public class CreateThread {
    public static void main(String args[])
    {
        NewThread nt = new NewThread();
        
        System.out.println(Thread.currentThread());
        nt.t.start(); 
        System.out.println(Thread.currentThread());
        try
        {
            for(int i =5; i > 0; i--)
            {
                System.out.println("main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread interrupted.");
        }
        
        System.out.println("Main Thread exiting.");
    }
    
}
