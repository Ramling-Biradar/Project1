package ramling;
import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        double min=0,max=0;
        int choice=0,n,i;
        double sum=0.0,avg;
        System.out.println("Enter array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        	sum=sum+a[i];
        }
        avg=sum/n;
        
        System.out.println("1.sum "+"2.Average "+"3.maximum "+"4.minimum ");
        System.out.println("Enter your choice");
       // for(i=1;i<=4;i++)
        
        choice=sc.nextInt();
        
        switch(choice)
        {
        case 1:System.out.println("The sum is :"+sum);
        break;
        case 2:System.out.println("The Average is :"+avg);
        break;
        case 3:max=a[0];
        for(i=1;i<n;i++)
        {
        	if(a[i]>max)
        	{
        		max=a[i];
        	}
        }
        
        
        System.out.println("The maximum number is "+max);
        break;
        case 4:min=a[0];
        for(i=1;i<n;i++)
        {
        	if(a[i]<min)
        	{
        		min=a[i];
        	}
        }
        System.out.println("The minimum number is: "+min);
        break;
        case 5:default:System.out.println("Invalid choice");
        break;
        }
        
        
        
        
        }
	
        

	

}
