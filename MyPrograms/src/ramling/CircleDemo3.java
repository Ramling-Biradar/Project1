package ramling;
class circle4
{
	double x,y;
	double r;
	double area()
	{
		return Math.PI*r*r;
	}
	double circumference()
	{
		return 2*Math.PI*r;
	}
	void setcircle(double a,double b,double c)
	{
		x=a;
		y=b;
		r=c;
	}
}
public class CircleDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle4 c1=new circle4();
		circle4 c2=new circle4();
		c1.setcircle(3.0,4.0,5.0);
		c2.setcircle(-4.0,-6.0,10.0);
		System.out.println("circumference of circle c1 is:"+c1.circumference());
		System.out.println("circumference of circle c2 is:"+c2.circumference());
		System.out.println("area of circle c1 is:"+c1.area());
		System.out.println("area of circle c2 is:"+c2.area());

	}

}
