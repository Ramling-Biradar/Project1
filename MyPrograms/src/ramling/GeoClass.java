package ramling;
class Box9
{
	double x=10.0;
	double y=20.0;
	double w=15.0;
	double area()
	{
		return (2*(x*y+x*w+y*w));
	}
	
}
class circle9
{
	double x=0.0;
	double y=0.0;
	double r=5.0;
	double area()
	{
		return (2*Math.PI*r);
	}
}
public class GeoClass {
static	double X=50;
	double y=60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box9 b=new Box9();
		circle9 c=new circle9();
	System.out.println("Geo class data X: "+X);
		System.out.println("Box data x:"+b.x);
		System.out.println("Box Area :"+b.area());
		System.out.println("circle data x:"+c.x);
		System.out.println("circle area "+c.area());
		

	}

}
