package ramling;
class r extends Thread
{
	public void run()
	{
		System.out.println("Status :"+Thread.currentThread().isAlive());
	}
}
public class alivtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		r a=new r();
		a.start();
	    try
		{
			a.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread Interrupted");
			
		}
		System.out.println("Status :"+a.isAlive());

	}

}
