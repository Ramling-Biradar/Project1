package ramling;
class ThreadID1 implements Runnable
{
	public void run()
	{
		try
		{
		System.out.println("Thread "+Thread.currentThread().getId()+"is running");
	}
	catch(Exception e)
	{
		System.out.println("Exception caught");
	}
}
}
public class ID2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;//no of threads 
		for(int i=0;i<8;i++)
		{
			Thread object=new Thread(new ThreadID1());
			object.start();
		}

	}

}

