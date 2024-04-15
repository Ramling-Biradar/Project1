package practice;
public class PresentOddP {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The elements present in even position");
		for(int i=0;i<a.length;i+=2)
		{
			System.out.println(a[i]+"  present at index "+i);
		}
		System.out.println();
		System.out.println("The elements present in odd position");
		System.out.println();
		for(int i=1;i<a.length;i+=2)
		{
			System.out.println(a[i]+"  present at index "+i);
		}
	}
}
