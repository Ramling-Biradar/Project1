package ramling;

public class P2 {
	static void checkprime(int n)
	{
		int i,m,flag=0;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+" is not prime number");
		}
		else
		{
			for( i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+"is prime not  number");
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println(n+"is  prime");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkprime(2);
		checkprime(4);
		checkprime(7);
		checkprime(18);
		

	}

}
