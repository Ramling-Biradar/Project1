package ramling;
class Box3
{
	double width;
	double height;
	double depth;
	Box3()
	{
		width=0.0;
		height=0.0;
		depth=0.0;
	}
	Box3(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class BoxWeight3 extends Box3
{
	double weight;
	BoxWeight3()
	{
		super();
		weight=0.0;
	}
	BoxWeight3(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight=m;	
	}
	
}
public class Demonstration_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3 mybox1=new Box3(10,20,15);
		BoxWeight3 mybox2=new BoxWeight3(2,3,4,0.076);
		double vol=mybox1.volume();
		System.out.println("volume of mybox1 is : "+vol);
		System.out.println();
		vol=mybox2.volume();
		System.out.println("volume of mybox2 is :"+vol);
		System.out.println("weight of mybox2 is :"+mybox2.weight);
		
		
		

	}

}
