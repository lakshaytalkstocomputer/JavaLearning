class Resource
{
		String t;
	
	Resource(String a)
	{
		this.t = a;
	}
	synchronized public void addString(String a)
	{   
		System.out.println("Adding Data");
		this.t= this.t+a;
	}
	public String getString()
	{
		return this.t;
	}	
}


class Caller implements Runnable
{
	Thread t;	
	Resource res;
	String s;

	Caller(Resource r,String a)
	{
		t = new Thread(this);
		res = r;
		this.s = a;
		
	}

	public void run()
	{
		System.out.println("Adding data to resource: ");
     	res.addString(this.s);
		//try
		//{
		//	Thread.sleep(1000);	
	//	}
	//	catch(Exception e)
	//	{

	//	}
	}

}



class multithreading
{
	public static void main(String args[])throws Exception
	{
		Resource res = new Resource("Hello");
		System.out.println(res.getString());

		Caller c1 = new Caller(res,"World");
		
		//System.out.println(res.getString());

		
		Caller c2 = new Caller(res,"Synchronized");
		//System.out.println(res.getString());

		//c1.t.start();
		c2.t.start();
		c1.t.start();
		//System.out.println("Adding data to resource: ");
		
         //System.out.println(res.getString());

		//System.out.println(res.getString());

		//System.out.println("Adding data to resource: "); 
		//c2.addDataToResource("synchronized");

		c1.t.join();
		c2.t.join();

		System.out.println(res.getString());

	}
}