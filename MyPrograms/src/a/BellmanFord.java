package a;
import java.util.Scanner;
public class BellmanFord {
	private int D[];
	private  int n;
	public static final int MAX_VALUE=999;
	public BellmanFord(int n)
	{
		this.n=n;
		D=new int[n+1];
	}
	public void shortest(int s,int A[][])
	{
		for(int i=1;i<=n;i++)
		{
			D[i]=MAX_VALUE;
			D[s]=0;	
		}
		for(int k=1;k<=n-1;k++)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(A[i][j]!=MAX_VALUE)
					{
						if(D[j]>D[i]+A[i][j])
							D[j]=D[i]+A[i][j];
					}
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(A[i][j]!=MAX_VALUE)
				{
					if(D[j]>D[i]+A[i][j])
						System.out.println("The graph is having negative edge cycles");
					
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println("The distance from source "+s+" to "+i+"is "+D[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,n=0;
		System.out.println("Enter the no of vertices");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int A[][]=new int[n+1][n+1];
		System.out.println("Enter the weighted matrix");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				A[i][j]=sc.nextInt();
				if(i==j)
				{
					A[i][j]=0;
					continue;
				}
				if(A[i][j]==0)
				{
					A[i][j]=MAX_VALUE;
					
				}
				
			}
		}
		System.out.println("Enter the source vertex");
		s=sc.nextInt();
		BellmanFord b=new BellmanFord(n);
		b.shortest(s,A);
		sc.close();
		
		

	}

}
