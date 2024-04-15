package ramling;
import java.lang.Math;
public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=200,max=400;
		System.out.println("The Random double value generated between "+min+"and "+min + " is");
		double a=Math.random()*(max-min+1)+min;
		System.out.println(a);
		System.out.println("The Random integer  value generated between "+min+"and "+min + " is");
		int b=(int)(Math.random()*(max-min+1)+min);
		System.out.println(b);
		
		

	}

}
