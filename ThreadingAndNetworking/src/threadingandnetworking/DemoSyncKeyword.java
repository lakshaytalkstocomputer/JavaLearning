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
class callme2
{
    void call(String msg)
    {
        System.out.print("["+ msg);
        try 
        {
        Thread.sleep(1000);
        
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread Interrupted.");
        }
        
        System.out.println("]");
    }
}

class caller2 implements Runnable
{
    String s;
    Thread t;
    callme2 target;
    
    public caller2(callme2 target, String msg )
    {
       t = new Thread(this);
       this.target = target;
       this.s = msg;
    }
    @Override
    public void run()
    {
        
        synchronized(target)
        {
            target.call(s);
        }
    }
}
public class DemoSyncKeyword {
    public static void main(String args[])
    {
        
        callme2 ob = new callme2();
                
        caller2 ob1 = new caller2(ob,"Hello");
        caller2 ob2 = new caller2(ob,"Good");
        caller2 ob3 = new caller2(ob,"Morning");
        
        
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        
        
                
    }
    
}
