package ramling;
class ClassA extends Thread
{
	public void run()
	{
		System.out.println("Start of Thread A....");
		for(int i=1;i<=5;i++)
		{
			if(i==1)
				yield();
			System.out.println("from Thread A : i="+i);
		}
		System.out.println("...Exiting from thread a");
	}
}
class ClassB extends Thread
{
	public void run()
	{
		System.out.println("Start of  ThreadB...");
		for(int j=1;j<=5;j++)
		{
			System.out.println("from Thread B : j="+j);
			if(j==2)
				stop();
		}
		System.out.println("Exiting from thread B");
		
	}
}
class ClassC extends Thread
{
	public void run()
	{
		System.out.println("starting thread c");
		for(int k=1;k<=5;k++)
		{
			System.out.println("from threadc : k="+k);
			if(k==1)
			{
				try
				{
					sleep(20000);
				}
				catch(Exception e) {}
			}
		}
		System.out.println("Exiting from thread c");
	}
}
public class Yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a=new ClassA();
		ClassB b=new ClassB();
		ClassC c=new ClassC();
		a.start();
		b.start();
		c.start();
		System.out.println("Ending Multi-threading");
		

	}

}
