package bkit;
enum seasons
{
	Spring,Winter,Summer,Fall;

	public static void main(String []args)
	{
		/*seasons s;
		s=seasons.Summer;
		System.out.println("The season is :"+s);*/
		for(seasons r : seasons.values())
		{
			System.out.print(r+" ");
			
		}
	/*	System.out.println();
		System.out.println(seasons.valueOf("Summer"));
		System.out.println(seasons.valueOf("Winter").ordinal());*/
		
		
	}

}
