package ramling;

public class For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= {111,125,84,54,74};
		int maxm=marks[0];
		for(int m:marks)
		{
			if(m>maxm)
			{
				maxm=m;
			}
		}
		System.out.println("Maximum marks is: "+maxm);

	}

}
