package ramling;
class prorityexp extends Thread
{
	public void run()
	{
		System.out.println("Hello world....");
	}
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prorityexp t1=new prorityexp();
		prorityexp t2=new prorityexp();
		prorityexp t3=new prorityexp();
		prorityexp t4=new prorityexp();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(2);
		t4.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		System.out.println("priority of thread t1 is :"+t1.getPriority());
		System.out.println("priority of thread t2 is :"+t2.getPriority());
		System.out.println("priority of thread t3 is :"+t3.getPriority());
		System.out.println("priority of thread t4 is: "+t4.getPriority());
		
		
		

	}

}
