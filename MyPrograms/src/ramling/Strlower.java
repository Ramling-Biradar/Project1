package ramling;

public class Strlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="RAMLING";
		str=str.toLowerCase();
		int ccount=0;
		int vcount=0;
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
			vcount++;
		}
		else
		{
			ccount++;
		}
		}
		System.out.println("The number of vowels in the string is "+vcount);
		System.out.println("The number of consonants in the string is "+ccount);
	}

}
