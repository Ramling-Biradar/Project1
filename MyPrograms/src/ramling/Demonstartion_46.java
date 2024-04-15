package ramling;
class Box2
{
	double width;
	double height;
	double depth;
	Box2()
	{
		width=0.0;
		height=0.0;
		depth=0.0;
	}
	Box2(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return width*height*depth;
	}
}
	class BoxWeight extends Box2
	{
		double weight;
		BoxWeight(double w,double h,double d,double m)
		{
			/*width=w;
			height=h;
			depth=d;*/
			super(w,h,d);
			weight=m;
		}
	}

public class Demonstartion_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2 mybox1=new Box2();
		BoxWeight mybox2=new BoxWeight(2,3,4,0.076);
		double vol=mybox1.volume();
		System.out.println("volume of mybox1 is : "+vol);
		System.out.println();
		vol=mybox2.volume();
		System.out.println("volume of mybox2 is :"+vol);
		System.out.println("weight of mybox2 is :"+mybox2.weight);
		

	}

}
