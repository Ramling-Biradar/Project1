package ramling;

public class Practice25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=6;
		String dayType;
		switch(day)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayType="Week day";
			break;
		case 6:
		case 7:
			dayType="Weekend";
			break;
		default:
			dayType="invalid day";
			
			
			
			
		}
		System.out.println("This day is:"+dayType);

	}

}
