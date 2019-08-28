class Thread1 extends Thread
{
	private Thread t1;
	private String threadName;
	Thread1(String str)
	{
		threadName=str;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i+" Number in Thrad:"+threadName);
				t1.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interruptd");
		}
		System.out.println("Existing from Thread :"+threadName);
	}
	public void start()
	{
		//System.out.println("Priority ="+t1.getPriority());
		if(t1==null)
		{
			t1 = new Thread(this,threadName);
			t1.setPriority(Thread.MIN_PRIORITY);
			t1.start();
			System.out.println("Thread-1 Priority ="+t1.getPriority());
			System.out.println("Thread1 is Alive()="+t1.isAlive());
		}
	}
}
class Thread2 extends Thread
{
	private Thread t2;
	private String threadName;
	Thread2(String str)
	{
		threadName=str;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=6;i++)
			{
				System.out.println(i+" Number in Thrad:"+threadName);
				t2.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interruptd");
		}
		System.out.println("Existing from Thread :"+threadName);
	}
	public void start()
	{
		if(t2==null)
		{
			t2 = new Thread(this,threadName);
			t2.setPriority(Thread.NORM_PRIORITY);
			t2.start();
			System.out.println("Thread-2 Priority ="+t2.getPriority());
			System.out.println("Thread-1 is Alive()="+t2.isAlive());
		}
	}
}
class Thread3 extends Thread
{
	private Thread t3;
	private String threadName;
	Thread3(String str)
	{
		threadName=str;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=7;i++)
			{
				System.out.println(i+" Number in Thrad:"+threadName);
				t3.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interruptd");
		}
		System.out.println("Existing from Thread :"+threadName);
	}
	public void start()
	{
		if(t3==null)
		{
			t3 = new Thread(this,threadName);
			t3.setPriority(Thread.MAX_PRIORITY);
			t3.start();
			System.out.println("Thread-3 Priority ="+t3.getPriority());
			System.out.println("Thread-3 is Alive()="+t3.isAlive());
		}
	}
}
public class Test
{
	public static void main(String args[])
	{
		Thread1 th1 = new Thread1("Thread-1");
		th1.start();
		Thread2 th2 = new Thread2("Thread-2");
		//System.out.println("Thread-2 Priority ="+t2.getPriority());
		th2.start();
		Thread3 th3 = new Thread3("Thread-3");
		//System.out.println("Thread-3 Priority ="+t3.getPriority());
		th3.start();
	}
}