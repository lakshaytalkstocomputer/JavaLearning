//Multithreading : suspending and resuming

class newthread implements Runnable
{
	Thread t;
	String name;

	newthread(String tname)
	{
		t = new Thread(this, tname);
		name = tname;
		System.out.println(t);
		t.start();

	}

	public void run()
	{
		for (int i = 1; i<10; i++)
		{
			System.out.println(name + " = " + i);
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{

			}

		}
		System.out.println(" EXIT FROM : "+ name);
	}
}

class s_resume
{
	public static void main(String args[])
	{
		newthread obj1 = new  newthread("one");
		newthread obj2 = new newthread("two");
		try{
			Thread.sleep(500);
			}
			catch(Exception E) 
			{

			}
		System.out.println("suspending Thread 1");	
		obj1.t.suspend();

			try{
			Thread.sleep(500);
			}
			catch(Exception E) 
			{
				
			}
		System.out.println("Resuming Thread 1");
		obj1.t.resume();

		System.out.println("suspending Thread 2");
		obj2.t.suspend();

			try{
			Thread.sleep(500);
			}
			catch(Exception E) 
			{
				
			}
		System.out.println("Resuming Thread 2");
		obj2.t.resume();
	}
}