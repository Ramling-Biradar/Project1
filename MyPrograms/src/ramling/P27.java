package ramling;

public class P27 {
	static void sumn(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumn(10);
		sumn(20);
		sumn(100);

	}

}
