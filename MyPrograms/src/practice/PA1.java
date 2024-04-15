package practice;

public class PA1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==j)
				{
					System.out.print("1"+" ");
					sum=sum+i;
				}
				else if(i<j){
					System.out.print("3"+" ");
				}
				else {
					System.out.print("2"+" ");
				}

				
			}
			System.out.println();
			
			
			
		}
		System.out.println(sum);
		
	

	}

}
