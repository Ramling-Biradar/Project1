package ramling;
class ThreadD extends Thread
{
	public void run()
	{
		System.out.println("start of threadc");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread d i:"+i);
		}
		System.out.println("end of threadc");
	}
}
class ThreadE extends Thread
{
	public void run()
	{
		System.out.println("start of thread d");
		for(int j=1;j<5;j++)
		{
			System.out.println("thread e j:"+j);
		}
		System.out.println("end of thread d");
	}
}
class ThreadF extends Thread
{
	public void run()
	{
		System.out.println("start of thread f");
		for(int k=1;k<=5;k++)
		{
			System.out.println("thread f with k:"+k);
		}
	}
}
public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadD d=new ThreadD();
		ThreadE e=new ThreadE();
		ThreadF f=new ThreadF();
		f.setPriority(Thread.MAX_PRIORITY);
		//e.setPriority(2);
		d.setPriority(Thread.MIN_PRIORITY);
		d.start();
		e.start();
		f.start();
		
		
		

	}

}
