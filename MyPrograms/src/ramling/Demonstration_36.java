package ramling;
class Point2
{
	int x,y;
	void setPoint(int a,int b)
	{
		x=a;
		y=b;
	}
}
public class Demonstration_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 p1=new Point2();
		Point2 p2=new Point2();
		p1.setPoint(10, 15);
		p2.setPoint(0, 0);
		System.out.println("x in p1:"+p1.x);
		System.out.println("y in p1:"+p1.y);
		System.out.println("x in p2:"+p2.x);
		System.out.println("y in p2:"+p2.y);
		
		
		

	}

}
