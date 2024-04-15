package ramling;
class circle
{
	double x,y;
	double r;
	double circumference()
	{
		return(2*Math.PI*r);
	}
	double area()
	{
		return(Math.PI*r*r);
	}
}
public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.x=0;
		c.y=0;
		c.r=5.0;
		System.out.println("Circumference of the circle is:"+c.circumference());
		System.out.println("Area of the circle is:"+c.area());
	

	}

}
