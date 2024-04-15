package ramling;

public class ArrayPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==1)
			{
				System.out.println("The elements at the even positins are");
				System.out.println(arr[i]+" position is"+(i+1));
			}
			else
			{
				System.out.println("The elements at the odd positins are");
				System.out.println(arr[i]+" position is"+(i+1));
				
			}
		}

	}

}
