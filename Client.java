package BankProject;
import java.util.*;
public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t*******************Welcome to  "+Bank.bankName+"  Bank*******************");
		
		while(true)
		{
			System.out.println("\t\t1.create new account");
			System.out.println("\t\t2.Check balance");
			System.out.println("\t\t3.Deposite amount");
			System.out.println("\t\t4.Withdraw Amount");
			System.out.println("\t\t5.Account hoder information");
			System.out.println("\t\t6.Delete Bank account");
			System.out.println("\t\t7: List Of All Accounts");
			System.out.println("\t\t8:Transfer Balance");
			System.out.println("\t\t9:Transaction History");
			System.out.println("\t\t10.Exit");
			
			System.out.println("enter your choice::--");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1)
			{
				System.out.println("enetr account holder name");
				String accountHolderName = sc.nextLine();
				System.out.println("enetr account number");
				String accountNum = sc.nextLine();
				System.out.println("enter balance");
				Double balance = sc.nextDouble();
				sc.nextLine();
				System.out.println("enter phone number");
				String phoneNumber = sc.nextLine();
				System.out.println("enetr adhar name");
				String name  = sc.nextLine();
				System.out.println("enter your address");
				String address = sc.nextLine();
				System.out.println("enter DOB");
				String dob = sc.nextLine();
				System.out.println("enter adharnumber");
				String adharnum = sc.nextLine();
				System.out.println("enter pancardnumber");
				String pannum = sc.nextLine();
				Pancard pan = new Pancard(name, dob, pannum);
				AdharCard adhar = new AdharCard(name, address, dob, adharnum);
			   Bank.createNewAccount(accountHolderName,accountNum,balance,phoneNumber, adhar,pan);
			}
			else if(choice == 2)
			{
				try
				{
				System.out.println("enter account number");
				String accountnum = sc.nextLine();
				Account account = Bank.getAccount(accountnum);
				account.checkBalance();
				}
				catch (Exception e) {
					System.out.println("Account Not Found Please Create Account First");
				}
			}
			else if(choice == 3)
			{
				try
				{
				System.out.println("enter account number");
				String accountnum = sc.nextLine();
				Account account = Bank.getAccount(accountnum);
				if(account == null)
				{
					throw new NullPointerException();
				}
				System.out.println("enter amount");
				double amount = sc.nextDouble();
				sc.nextLine();
				account.deposite(amount);
				}
				catch (Exception e) {
					System.out.println("Account Not Found Please Create Account First");
				}
				
			}
			else if(choice == 4)
			{
				try
				{
				System.out.println("enter account number");
				String accountnum = sc.nextLine();
				System.out.println("enetr amount");
				double amount = sc.nextDouble();
				sc.nextLine();
				Account account = Bank.getAccount(accountnum);
				account.withdraw(amount);
				}
				catch (Exception e) {
					System.out.println("Account Not Found Please Create Account First");
				}
			}
			else if(choice == 5)
			{
				try
				{
				System.out.println("enter account number");
				String accountnum = sc.nextLine();
				Account account = Bank.getAccount(accountnum);
				account.printAccountHolderDetsils();
				}
				catch (Exception e) {
					System.out.println("Account Not Found Please Create Account First");
				}
			}
			else if(choice == 6)
			{
				try
				{
				System.out.println("enter account number");
				String accountnum = sc.nextLine();
				Bank.removeAccount(accountnum);
				}
				catch (Exception e) {
					System.out.println("Account Not Found Please Create Account First");
				}
			   	
			}
			else if(choice  == 7)
			{
				try {
					Bank.getAllAccountsInformation();
				} catch (Exception e) {
					System.out.println("No record/bank A/c found in bank db");
				}
			}
			else if(choice == 8)
			{
				try
				{
				System.out.println("enter account Number from which you want to transfer");
				String accounumFrom = sc.nextLine();
				System.out.println("enter amount how much you want transfer");
				double amount = sc.nextDouble();
				sc.nextLine();
				System.out.println("enter account Number where you want to transfer");
				String accounumTo = sc.nextLine();
				Bank.balanceTransfer(accounumFrom,amount,accounumTo);
				}
				catch (Exception e) {
					System.out.println("Account Not Found Please Create Account First");
				}
			}
			else if(choice == 9)
			{
			try
			{
			System.out.println("enter account number");
			String accountnum = sc.nextLine();
			Account account = Bank.getAccount(accountnum);
			account.transactionHistory();
			}
			catch (Exception e) {
				System.out.println("Account Not Found Please Create Account First");
			}
			}
			else if(choice == 10)
			{
				System.out.println("Your Account Log Out Successfully...................");
				break;
			}
		}

	}

}
