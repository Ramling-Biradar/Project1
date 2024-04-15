package ramling;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,40,99,44};
		int key=40;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("the element "+key+" found at location"+(i+1));
				break;
				
			}
			
		}
		

	}

}
