package ramling;
import java.util.Scanner;
public class Practice36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			String name;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			name=sc.next();
			if(name!="joe")
				continue;
			System.out.println("Hello joe");
			String password;
			password=sc.next();
			if(password=="fish")
				break;
			
				
			
			
			
		}
		System.out.println("Thank you");
	
	

	}

}
