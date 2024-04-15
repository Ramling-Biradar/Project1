package practice;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer :for(int i=1;i<=3;i++)
		{
			System.out.println(i);
			inner :for(int j=1;j<=3;j++)
			{
			System.out.println("kodnest");
			break outer;
			
			
			}
		}

	}

}
