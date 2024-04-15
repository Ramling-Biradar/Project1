package ramling;
class thread11 implements Runnable

{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("From thread1 with i:"+-1*i);
		}
		System.out.println("Exitimg from thread1");
	}
	
}
class thread22 implements Runnable{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("From thread2 with j: "+2*j);
		}
		System.out.println("Exiting from thread2");
	}
}
class thread3 implements Runnable
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("From thread3 with k :"+(2*k-1));
		}
		System.out.println("Exiting from thread3");
	}
}

public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread11 a=new thread11();
		Thread t1=new Thread(a);
		//t1.start();
		thread22 b=new thread22();
		Thread t2=new Thread(b);
	//	t2.start();
		Thread t3=new Thread (new thread3());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Exiting from multithreading...");
		
		
	}

}
