package BankProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Account {
	private String accountHolderName;
	private String accountNum;
	private double balance;
	private String phoneNumber;
	private AdharCard adhar;
	private Pancard pan;
    private double previous;
	int j=0;
	int i = 0;
     LinkedHashMap<String,Double> arr = new LinkedHashMap<>();
	public Account(String accountHolderName, String accountNum, double balance, String phoneNumber, AdharCard adhar,
			Pancard pan) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
		this.adhar = adhar;
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNum=" + accountNum + ", balance=" + balance
				+ ", phoneNumber=" + phoneNumber + ", adhar=" + adhar + ", pan=" + pan + "]";
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public AdharCard getAdhar() {
		return adhar;
	}

	public void setAdhar(AdharCard adhar) {
		this.adhar = adhar;
	}

	public Pancard getPan() {
		return pan;
	}

	public void setPan(Pancard pan) {
		this.pan = pan;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			this.balance = this.balance + amount;
			previous = amount;
			String str = "Deposited"+i;
			arr.put(str,previous);
			i++;

		}
		System.out.println("your Account  " + accountNum + "  is creadited with amount " + amount);
		System.out.println("total balance is " + balance);

	}

	public void withdraw(double amount) {
		if (amount < balance) {
			this.balance = this.balance - amount;
			previous = amount;
			String str ="withdraw"+j;
			arr.put(str,previous);
			j++;
			System.out.println("your Account " + accountNum + " is debited with amount " + amount);
			System.out.println("total balance is " + balance);

		} else {
			System.out.println("sorry cannot process insufficient balance");
		}

	}

	public void checkBalance() {
		System.out.println("Your A/c no=" + accountNum);
		System.out.println("Current balance in your account=" + balance);
	}
	public void transactionHistory()
	{
		System.out.println("Transaction history=");
		for(String st : arr.keySet())
		{
			System.out.println(st+" = "+arr.get(st));
		}
	}
	public void printAccountHolderDetsils()
	{
		System.out.println("********************************************************************");
		System.out.println("Account Holder Information::--");
		System.out.println("AccountHolder Name="+this.accountHolderName);
		System.out.println("AccountNumber Name="+this.accountNum);
		System.out.println("Account Available Balance="+this.balance);
		System.out.println("Account Contact number"+this.phoneNumber);
		
		System.out.println();
		System.out.println("AdharCard Information::--");
		System.out.println("AdharCard Holder Name="+adhar.getAdharnumber());
		System.out.println("Adhar Address"+adhar.getAddress());
		System.out.println("Adhar DOB="+adhar.getDob());
		System.out.println("Adhar AdharNumber"+adhar.getAdharnumber());
		
		System.out.println();
		System.out.println("PanCard Information::--");
		System.out.println("PanCard Holder Name"+pan.getName());
		System.out.println("pancar DoB="+pan.getDob());
		System.out.println("PanCard Number="+pan.getPanNumber());
		System.out.println("********************************************************************");
	}

}
