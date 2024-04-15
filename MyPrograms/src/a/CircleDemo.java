package a;
class circle
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
	circle(double a,double b,double c)
	{
		x=a;
		y=b;
				r=c;
	}
	
	
}
public class CircleDemo {

	public static void main(String[] args) {
		circle c1=new circle(3.0,4.0,5.0);
		circle c2=new circle(1.0,2.0,10.0);
		System.out.println("The Circumfernce of the circle c1 is"+c1.circumference());
		System.out.println("The Circumfernce of the circle c2 is"+c2.circumference());
		System.out.println("The area of circle c1 is:"+c1.area());
		System.out.println("The area of circle c2 is:"+c2.area());
		
		
		//31.4,62.84,78.55,314.2
		
		
		
	}

}
