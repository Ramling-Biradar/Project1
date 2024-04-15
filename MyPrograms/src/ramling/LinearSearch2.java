package ramling;
import java.util.Scanner;
public class LinearSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,search,a[],n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements");
		for(c=0;c<n;c++)
			a[c]=sc.nextInt();
		System.out.println("Enter the element to search");
		search=sc.nextInt();
		for(c=0;c<a.length;c++)
		{
			if(a[c]==search)
			{
				System.out.println("The element found at index "+c);
				break;
				
			}
		}
		if(c==n)
		{
			System.out.println(search+"not found in the list");
		}

	}

}
