package ramling;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,4,5,6,8};
		for(int i=0;i<arr.length;i++)
		{
			if(i!=arr[i])
			{
				System.out.println(i);
				break;
			}
		}
		

	}

}
