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

interface MyIF
{
    int getNumber();
    
    default String getString()
    {
        return "Default String";
    }
    
}

class MyIFImp implements MyIF
{
    @Override
    public int getNumber()
    {
        return 100;
    }
}

public class DefaultMethod {
 public static void main(String args[])
 {
     MyIFImp ob = new MyIFImp();
     
     System.out.println(ob.getNumber());
     System.out.println(ob.getString());
 }
}
