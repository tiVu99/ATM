public class ATM
{
	int balance;
	Integer enteredNumber;
	Toolbox myToolbox = new Toolbox();
	
	// main method
	
	public static void main(String[] args)
	{
		ATM myATM = new ATM();
		myATM.go();
	}
	
	public void go()
	{
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		
		// don't allow the starting balance to be negative
		// use a loop until a valid input is provided. 
		
			while (true) 
			{
				balance = myToolbox.readIntegerFromCmd();
			
				if (balance > 0)
				{
					break;
				}
			}
			
		System.out.println(balance);
	
		// print out a menu 
		
		System.out.println("What do you want to do?");
		System.out.println("1 : Withdraw");
		System.out.println("2 : Deposit");
		System.out.println("3 : Inquire");
		System.out.println("4 : Quit");
		enteredNumber = myToolbox.readIntegerFromCmd();
		
		// if statement
		
		if (enteredNumber.equals(1))
		{
			this.withdraw();
		}
		
		else if (enteredNumber.equals(2))
		{
			this.deposit();
		}
		
		else if (enteredNumber.equals(3))
		{
			this.inquire();
		}
		
		else if (enteredNumber.equals(4))
		{
			this.quit();
		}
	}
	
	// method for withdraw
	
	public void withdraw()
	{
		
		System.out.println("*****************************************");
		System.out.println("Withdrawal");
		System.out.println("*****************************************");
		
		
		System.out.println("How much would you like to withdraw?");
		
			// don't accept negative withdrawals and don't allow the balance to drop to a negative number
			// use a loop until a valid input is provided
			
			while (true) 
			{
				enteredNumber = myToolbox.readIntegerFromCmd();
			
				if (enteredNumber > 0 && enteredNumber < balance) 
				{
					break;
				}
			}
			
		balance = balance - enteredNumber;
			
		System.out.println("*****************************************");
		System.out.println("Your new balance is "+balance);
		System.out.println("*****************************************");
		
			
		System.exit(0);
		
	}
	
	// method for deposit
	
	public void deposit()
	{
		
		System.out.println("*****************************************");
		System.out.println("Deposit");
		System.out.println("*****************************************");
			
		System.out.println("How much would you like to deposit?");
		
			// don't accept negative deposits
			// use a loop until a valid input is provided
			
			while (true)
			{
				enteredNumber = myToolbox.readIntegerFromCmd();
			
				if (enteredNumber > 0) 
				{
					break;
				}	
			}
		
		
		balance = balance + enteredNumber;
			
		System.out.println("*****************************************");
		System.out.println("Your new balance is "+balance);
		System.out.println("*****************************************");
			
		System.exit(0);
		
		
	}
	
	// method for inquire
	
	public void inquire()
	{
		
		if (enteredNumber.equals(3))
		{
			System.out.println("*****************************************");
			System.out.println("Your balance is "+balance);
			System.out.println("*****************************************");
			System.exit(0);
		}
		
	}

	// method for quit
	
	public void quit()
	{
		
		System.out.println("*****************************************");
		System.out.println("GoodBye!");
		System.out.println("*****************************************");
		System.exit(0);
		
	}
}
	
