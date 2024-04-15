import java.util.*;
public class ShapeDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,4,5,6};
		Arrays.sort(a);
		for(int ele:a)
		{
			System.out.println(ele);
		}
		Shape s=new Shape();
		System.out.println("Length :"+s.length);
		System.out.println("Breadth is :"+s.breadth);
		s.area();
		

	}

}
