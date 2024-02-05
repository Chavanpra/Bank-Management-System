package BankProject;
import java.util.HashMap;
import java.util.Map;
public class Bank {
	public static final String bankName = "Pravin Bank";
  public static Map<String,Account> bankdb=new HashMap<>();
	public static void createNewAccount(String accountHolderName, String accountNum, double balance, String phoneNumber, AdharCard adhar,
			Pancard pan )
	{
		Account account  = new Account(accountHolderName, accountNum, balance, phoneNumber, adhar, pan);
		bankdb.put(accountNum, account);
		System.out.println("Welcome to "+bankName+" Bank");
		System.out.println("Your account is created successfully with account number="+accountNum);
	}
	public static void removeAccount(String accountNumber)
	{
		if(bankdb.containsKey(accountNumber))
		{
			bankdb.remove(accountNumber);
			System.out.println("thank you for using our "+bankName);
			System.out.println("your account is deleted successfully with Account number "+accountNumber);
		}
		else
		{
			System.out.println("account with A/c no "+ accountNumber+" is not found");
		}
		
	}
	public static Account getAccount(String accountNumbe)
	{
		Account acc=null;
		if(bankdb.containsKey(accountNumbe))
		{
			acc=bankdb.get(accountNumbe);
		}
		return acc;
	}
	public static void getAllAccountsInformation() {
		// printing all database of bank.
		System.out.println("Bank database: " + bankdb);

		try {
			for (String key : bankdb.keySet()) {
				bankdb.get(key).printAccountHolderDetsils();
			}
		} catch (Exception e) {
			System.out.println("No record/account found in bank db");
		}

	}
	public static void balanceTransfer(String accounumFrom, double amount,String accounumTo) {
		try
		{
			if(bankdb.containsKey(accounumFrom) && bankdb.containsKey(accounumTo))
			{
			  double a = bankdb.get(accounumTo).getBalance();
			  bankdb.get(accounumTo).setBalance(a+amount);
			  double b = bankdb.get(accounumFrom).getBalance();
			  bankdb.get(accounumFrom).setBalance(b-amount);
			  System.out.println("successfully amount trnserfrom "+accounumFrom+" to "+accounumTo);
			  
			}
		}
		catch (Exception e) {
			System.out.println("Account not found please enter valid account number");
		}
		
	}
	

}
