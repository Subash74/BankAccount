package lab;
/**
 * <b>this is a short description of class</b><br>
 * this is a program to implement a bank account class<br>
 *
 * <b>this is a short description of class</b>
 * This is the class the implements the following method <br>
 * 1.attributes like bank name,account holder name,account number ,remaining balance
 * 2.methods for deposit 
 * 3.method for account details
 * @author subash
 * @version 1.0
 *
 */

public class BankAccount {

	String name,bank_name ,acctNo;
	float balance;
	
	private final float Min_Amnt;
	private final float Max_withdrawl;
 
/**
 * 
 * @param name name of the account holder
 * @param acctNo account number
 * @param bank_name name of the bank
 * @param balance remaining balance in the bank
 */
	BankAccount(String name, String acctNo,String bank_name, float balance){
		this.name = name;
		this.bank_name= bank_name;
		this.acctNo = acctNo;
		this.balance = balance;
		Min_Amnt = 1000;
		Max_withdrawl = 5000;
	}

	/**
	 * 
	 * @param Deposit amount to deposit
	 * @return balance balance in account
	 */
	int Deposit(int Deposit){
		return (int) (balance = balance + Deposit);
	}



	/**
	 * this is a method to display the name of the bank,name of the account holder,account number,account balance of the person
	 * @see bank_name()
	 * @see name()
	 * @see acctNo()
	 * @see balance()
	 */
	void getBalance(){
		System.out.println("Account Details:");
		System.out.println("Account number: "+bank_name);
		System.out.println("Account holder name: "+name);
		System.out.println("Account number: "+acctNo);
		System.out.println("availabe balance of: "+balance);
	}
	public static void main(String[] args) {
	}
	
}
