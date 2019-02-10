// Thread synchronuization

class callme
{
	synchronized public void display(String mess)
	{
		System.out.println(mess);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{

		}
	}
}


class caller implements Runnable
{
	Thread t;
	String name;
	String message;

	caller(String tname, String mess)
	{
		t = new Thread(this, tname);
		
		name = tname;
		message = mess;
		System.out.println(t);		
		t.start();
	}
	public void run()
	{
     	callme ob = new callme();
     	ob.display(message);
	}
}


class syn_Thread
{
	public static void main(String args[])
	{
		caller obj1  = new caller("one","Hello");
		caller obj2  = new caller("two","Synchronized");
		caller obj3  = new caller("three","World");
	}
}