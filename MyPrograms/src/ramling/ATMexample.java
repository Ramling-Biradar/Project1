package ramling;
import java.util.Scanner;
public class ATMexample {

	public static void main(String[] args) {
		// TODO Auto-generated method 
int balance=100000,withdraw,deposit;
Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("Automated Teller Machine(ATM)");
	System.out.println("Press 1 for withdraw");
	System.out.println("Press 2 for Deposit");
	System.out.println("Press 3 for Checking Balance");
	System.out.println("Press 4 for Exit");
	System.out.println("Enter your operation ");
	
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:System.out.println("Enetr the amout for withdraw");
	 withdraw=sc.nextInt();
	 if(balance>=withdraw)
	 {
		 balance=balance-withdraw;
		 System.out.println("Amount withdrawn is :"+withdraw);
		 System.out.println("Please collect your money");
		 
	 }
	 else
	 {
		 System.out.println("Insufficient amount");
	 }
	 System.out.println(" ");
	 break;
	case 2:System.out.println("Enter the amount for deposit");
	deposit=sc.nextInt();
	balance=balance+deposit;
	System.out.println("The Deposited amount is:"+deposit);
	System.out.println(" ");
	break;
	case 3:
		System.out.println("Your Balance is :"+balance);
		System.out.println(" ");
		break;
	case 4:
		System.exit(0);
		break;
		
	
	
	
	}

}

	}

}
