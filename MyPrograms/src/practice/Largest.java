package practice;
public class Largest {
	public static void main(String[] args) {
     int a[]= {10,60,80,44,-4};
     int largest,smallest;
     largest=a[0];
     
     for(int i=1;i<a.length;i++)
     {
    	 if(a[i]>largest)
    	 {
    		 largest=a[i];
    	 }
     }
     System.out.println("The largest number in the given array is :"+largest);
     smallest=a[0];
     for(int i=1;i<a.length;i++)
     {
    	 if(a[i]<largest)
    	 {
    		 smallest=a[i];
    	 }
     }
     System.out.println("The smallest number in the given array is :"+smallest);
	}
}
