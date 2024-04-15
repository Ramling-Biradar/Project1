package practice;

public class GFG1 {
	static int  findsum(int A[],int N)
	{
		int max=A[0];
		for(int i=1;i<N;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
			
		}
		int min=A[0];
		for(int i=1;i<N;i++)
		{
			if(A[i]<min)
			{
				min=A[i];
			}
		}
		return min+max;
		
	}


	public static void main(String[] args) {
		int A[]= {-1,2,-6,4,2};
		int N=5;
		System.out.println(findsum(A,N));
		
	}

}
