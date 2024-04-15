package ramling;

public class Practice19  extends Thread{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(++i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice19 p=new Practice19();
		p.start();

	}

}
