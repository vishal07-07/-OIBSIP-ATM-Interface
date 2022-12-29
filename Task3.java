import java.util.Scanner;

public class Task3
{
	public static void main(String[] args) 
	{

		int choice, pin=0, k;
		long amount=0,deposit=0,withdraw=0;
		Scanner s = new Scanner(System.in);
		String transactionHistory="";
		int ID=1234;
		 do{
		 	System.out.println("\nEnter your id : ");
			ID = s.nextInt();
		
			
			System.out.println("\nEnter your pin : ");
			pin = s.nextInt();
			

			if(ID != 1234 || pin!=5678)
				System.out.println("Something went wrong please enter correct !");
		 }

		while(ID != 1234 && pin!=5678);
		
		do
		{
			System.out.println("\n--------Welcome To ATM Service--------\n");
			System.out.println("1. Transaction History.");
			System.out.println("2. Withdraw.");
			System.out.println("3. Deposit.");
			System.out.println("4. Transfer.");
			System.out.println("5. Quit.");

			System.out.println("\n\nEnter your choice : ");
			choice = s.nextInt();

			switch(choice)
			{
				
				
				case 1:
					System.out.println("Trasction History\n" + transactionHistory);
					break;

				case 2:
					System.out.println("\nEnter the amount to withdraw : ");
					int b = s.nextInt();

					if(b % 100 != 0)
					{
						System.out.println("\nPlease Enter the amount in multiple of 100.");
					}
					else if(b > (amount - 1000))
					{
						System.out.println("\nInsufficent balance in your account.");
					}
					else
					{
						amount = amount - b;
						System.out.println("\n\nPlease receive cash.");
						System.out.println("Your current balance is : " + amount);
					}
					break;

				case 3:
					System.out.println("\nEnter the amount to Deposit : ");
					int c = s.nextInt();
					amount = amount + c;
					System.out.println("Your  current balance is : "+amount);
					break;

				case 4:
					System.out.println("------------Transfer to the account-------------");
					{
						Scanner sc = new Scanner(System.in);
						System.out.print("\nEnter Receipent's Name : ");
						String receipent = sc.nextLine();
						System.out.print("\nEnter amount you wish to transfer : ");
						float amount1 = sc.nextFloat();
		
						try {
								if ( amount >= amount1 ) {
									if ( amount1 <= 150000f ) {
										amount -= amount1;
										System.out.println("\nSuccessfully Transfered to : " + receipent);
										String str = amount1 + " : Rs transfered to : " + receipent + "\n";
										transactionHistory = transactionHistory.concat(str);
									}
								else {
										System.out.println("\nINVALID TRANSFER...Limit is 150000.00 only");
									}
								}
								else {
										System.out.println("\nInsufficient Balance");
									}
							}
						catch (Exception e) {
							System.out.println(e);
						}
					}

				case 5:
					System.out.println("  \n\n  Thank you for using ATM service  \n\n  ");
					break;

				default:
					System.out.println("Invalid choice");

			}

			
		}while(choice!=5);
	}
}