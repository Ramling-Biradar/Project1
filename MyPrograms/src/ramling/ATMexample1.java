package ramling;
import java.util.Scanner;
public class ATMexample1 {
	public static void main(String[] args)
	{
		int balance=100000,withdraw,deposit;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Automated Teller Machine(ATM)");
			System.out.println("Press 1 for Withdraw Amount");
			System.out.println("Press 2 for Deposit Amount");
			System.out.println("Press 3 for Check Balance");
			System.out.println("Press 4 for Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter the Amount for withdraw");
			withdraw=sc.nextInt();
			if(balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println("Amount with drawn is :"+withdraw);
				System.out.println("collect your amount");
			}
			else
			{
				System.out.println("Insufficient Amount");
			}
			System.out.println(" ");
			break;
			case 2:System.out.println("Enter Amount for Deposit");
			deposit=sc.nextInt();
			balance=balance+deposit;
			System.out.println(deposit+" ruppes has been deposited successfully");
			System.out.println(" ");
			break;
			case 3:System.out.println("your balance is :"+balance);
			System.out.println(" ");
			break;
			case 4:
				System.exit(0);
				break;
				
			
			}
			
			
		}
		
	 
	}

}
