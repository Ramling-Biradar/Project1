package ramling;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Ramling";
		int count=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
		

	}

}
