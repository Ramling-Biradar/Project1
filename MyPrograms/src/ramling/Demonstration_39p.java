package ramling;
class circlep
{
	double x,y;
	double r;
	circlep(double a,double b,double c)
	{
		x=a;
		y=b;
		r=c;
		
	}
	circlep(double c)
	{
		x=0;
		y=0;
		r=5.0;
	}
	circlep(circlep c)
	{
		x=c.x;
		y=c.y;
		r=c.r;
		
	}
	circlep()
	{
		x=0.0;
		y=0.0;
		r=1.0;
	}
	double circumference()
	{
		return 2*Math.PI*r;
	}
	double area()
	{
		return Math.PI*r*r;
	}
}
public class Demonstration_39p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circlep c1=new circlep(3.0,4.0,5.0);
		circlep c2=new circlep(5.0);
		circlep c3=new circlep(c1);
		circlep c4=new circlep();
		System.out.println("The area of circle c1 is:"+c1.area());
		System.out.println("The circumference of circle c1 is:"+c1.circumference());
		System.out.println("The area of circle c2 is:"+c2.area());
		System.out.println("The circumfernce of circle c2 is"+c2.circumference());
		System.out.println("The area of circle c3 is:"+c3.area());
		System.out.println("The circumfernce of circle c3 is:"+c3.circumference());
		System.out.println("The area of circle c4 is:"+c4.area());
		System.out.println("The circumfernce of circle c4 is:"+c4.circumference());

	

	}

}
