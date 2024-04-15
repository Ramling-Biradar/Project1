package ramling;

public class StaticScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x=10;
		if(x==10)
		{
			int y=20;
			System.out.println("x and y are " +x +" and "+y);
			x=y*2;
			
		
		//y=100;
		System.out.println("x= "+x);
		}

	}

}
