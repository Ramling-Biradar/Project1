package ramling;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		int a[],n,search,i;
		int low,high,mid;
		 a=new int[100];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no of elements in an array");
		 n=sc.nextInt();
		 System.out.println("enter the elemrnts of an array");
		 for(i=0;i<n;i++)
		 a[i]=sc.nextInt();
		 System.out.println("enter the search element");
		 search=sc.nextInt();
		 sc.close();
		 low=0;
		 high=n-1;
		 mid=(low+high)/2;
		 while(low<=high)
		 {
			 mid=(low+high)/2;
			 if(a[mid]<search)
			 low=mid+1;
			 else if(a[mid]==search)
			 {
				 System.out.println(search+"found in the list");
				 break;
			 }
			 else
				 high=mid-1;
			 mid=(low+high)/2;
		 }
		 if(low>high)
		 {
			 System.out.println("search element not fouund");
			 
		 }
				 
	}

}
