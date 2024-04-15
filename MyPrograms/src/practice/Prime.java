package practice;

public class Prime {
	static void prime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("it is not a prime");
				break;
			}
			else
			{
			
				System.out.println("it is  a prime");
			}
				 
			
		}
	}

	public static void main(String[] args) {
		
           prime(9);
	}

}
