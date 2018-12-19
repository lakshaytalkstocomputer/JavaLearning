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

/**
 *  Dynamic Method Dispatch is a mechanism by which a  all to an overridden 
 *  method is resolved at runtime, rather than compile time. Dynamic method d
 *  dispatch is important because this is how JAVA implements 
 *  run-time polymorphism
 */
class A
{
    void callme()
    {   
        System.out.println("Inside A's callme method");
    }
}

class B extends A
{
    @Override
    void callme()
    {
        System.out.println("Inside B's callme method");
    }
}

class C extends B
{
    @Override
    void callme()
    {
        System.out.println("Inside C's callme method");
    }
}

public class DynamicMethodDispatch {
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();
        
        A r; // Superclass Reference
        
        r = a;
        r.callme();
        
        r = b;
        r.callme();
        
        r = c;
        r.callme();
                      
    }
    
}
