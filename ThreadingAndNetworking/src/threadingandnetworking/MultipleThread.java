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

class NewThread3 implements Runnable
{
    String name;
    Thread t;
    
    NewThread3(String threadname)
    {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: "+ t);
        
    }
    @Override
    public void run() {
        try 
        {
            for(int i =5 ;i > 0 ; i--)
            {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException  e)
        {
            System.out.println(name + "Interreupted.");
        }
        System.out.println(name + " exiting");
    }
    
}
public class MultipleThread {
    public static void main(String args[])
    {
        NewThread3 nt1 = new NewThread3("One");
        NewThread3 nt2 = new NewThread3("Two");
        NewThread3 nt3 = new NewThread3("Three");
    
    
    // Start the threads
    nt1.t.start();
    nt1.t.start();
    
    
}
