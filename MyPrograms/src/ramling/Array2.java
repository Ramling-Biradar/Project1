package ramling;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,1,3,5,3,4,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				
					System.out.println(a[i]);
				}
				
			}
		}

	}

}

