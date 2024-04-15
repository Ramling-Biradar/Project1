package ramling;
class Point1
{
	int x,y;
	void setPoint(int a,int b)
	{
		x=a;
		y=b;
	}
}
public class Demonstration_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1 p=new Point1();
		p.setPoint(10,15);
		System.out.println("x :"+p.x);
		System.out.println("y :"+p.y);

	}

}
