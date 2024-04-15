package ramling;

public class Practice9 implements Runnable{
	public void run() {
		System.out.println("Thread is Running.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice9 p=new Practice9();
		Thread t=new Thread(p);
		t.start();
		//t1.start();
		

	}

}
