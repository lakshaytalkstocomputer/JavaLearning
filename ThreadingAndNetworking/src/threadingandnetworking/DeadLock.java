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

class A
{
    synchronized void foo(B b)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo ");
        
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("A interrupted");
        }
        
        System.out.println(name + "trying to call B.last() ");
        b.last();
    }
    
    synchronized void last()
    {
        System.out.println("Inside A.last ");
    }
}


class B
{
    synchronized void bar(A a)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar ");
        
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("B interrupted");
        }
        
        System.out.println(name + "trying to call A.last() ");
        a.last();
    }
    
    synchronized void last()
    {
        System.out.println("Inside B.last ");
    }
}
public class DeadLock implements Runnable{
    
    A a = new A();
    B b = new B();
    
    Thread t;
    
    public DeadLock()
    {
        Thread.currentThread().setName("MainThread");
        t = new Thread(this, "RacingThread");
    }
    void deadlockStart()
    {
        t.start();
        a.foo(b); // get lock on a in this thread
        System.out.println("Back in main Thread");
    }
    
    public void run()
    {
        b.bar(a); // get lock on b in this thread
        System.out.println("Back in other thread"); 
    }
    
    public static void main(String args[])
    {
        DeadLock d1 = new DeadLock();
        d1.deadlockStart();
    }
}
