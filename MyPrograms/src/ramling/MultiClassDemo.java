package ramling;
class circle2
{
	double x,y;
	double r;
	double circumference()
	{
		return 2*Math.PI*r;
	}
	double area()
	{
		return Math.PI*r*r;
	}
}
class Box
{
	double width;
	double depth;
	double height;
	double area()
	{
		double a;
		a=(width*depth+depth*height+width*height)*2;
		return a;
	}
	double volume()
	{
		double v;
		v=width*depth*height;
		return v;
	}
	
}
public class MultiClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle2 c=new circle2();
		Box b=new Box();
		c.x=3.0;
		c.y=4.0;
		c.r=5.0;
		b.width=3.0;
		b.height=4.0;
		b.depth=5.0;
		System.out.println("circumference of the circle is:"+c.circumference());
		System.out.println("area of the circle is:"+c.area());
		System.out.println("area of the box is:"+b.area());
		System.out.println("volume of the box is"+b.volume());

	}

}
