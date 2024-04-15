package ramling;

public class Practice24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=9;
		String dayString;
		switch(day)
		{
		case 1:
			dayString="Monday";
			break;
		case 2:
			dayString="Tuesday";
			break;
		case 3:
			dayString="Wednesday";
			break;
		case 4:
			dayString="Thrusday";
			break;
		case 5:
			dayString="Friday";
			break;
		case 6:
			dayString="Saturaday";
			break;
		case 7:
			dayString="Sunday";
			break;
			default:
				dayString="Invalid day";
				//System.out.println("Invalid day");
			
		}
		System.out.println("day :"+dayString);

	}

}
