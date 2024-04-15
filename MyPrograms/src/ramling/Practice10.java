package ramling;
class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("First thread starts running");
			sleep(10000);
			System.out.println("First thread finishes running");
		}
		catch(Exception e) {}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Second Thread stsrts running");
			System.out.println("second thread susupendend itself");
			suspend();
			System.out.println("second thread runs again");
		}
		catch(Exception e) {}
	}
}
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Thread1 first=new Thread1();
			Thread2 second=new Thread2();
			first.start();
			second.start();
		    System.out.println("Revive the second thread");
		    second.resume();
		    System.out.println("second thread went sllep for 10 seconds");
		    second.sleep(10000);
		    System.out.println("wake up second thread and finishes running");
		    
		    
		}
		catch(Exception e) {}

	}

}
