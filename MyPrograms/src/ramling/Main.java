package ramling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=Thread.currentThread();
		System.out.print(thread.activeCount());
		thread.run();
		/*try
		{
		thread.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrepted");
		}*/
		System.out.print(thread.activeCount());
		//System.out.println(thread.isAlive());

	}
	

}
