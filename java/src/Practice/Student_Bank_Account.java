package Practice;
class Account{
	private static int newAccNo = 1019;
	int accNo;
	String accName;
	String address;
	String phone;
	String emailID;
	double balance;
	
	Account(String accName, String address, String phone, String emailID, double balance){
		
		this.accName = accName;
		this.address = address;
		this.phone = phone;
		this.emailID = emailID;
		this.balance = balance;
		newAccNo++;
		accNo = newAccNo;
		
		}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}
	
	protected double currBalance(double amount) {
		return balance += amount;
	}

	@Override 
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", address=" + address + ", phone=" + phone
				+ ", emailID=" + emailID + ", balance=" + balance + "]";
	}
}

class SavingsAccount extends Account{
	double currentBalance;
	

	SavingsAccount(String accName, String address, String phone, String emailID, double balance) {
		super(accName, address, phone, emailID, balance);
	}


	public void deposit(double amount) {
		 currentBalance = super.balance += amount;
		 System.out.println("Your current Balance is "+ getBalance());
	}
	
	public void withdraw(double amount) {
		if(amount > super.balance) {
		System.out.println("\n!!!! Not enough funds in your account ");
		System.out.println("Your current Balance is " + super.getBalance());
		}else {
			super.balance -= amount;
			System.out.println("\nYour remaining Balance is "+ super.getBalance());
		}
	}

}


class LoanAccount extends Account{
	
	private double loanBalance;
	
	LoanAccount(String accName, String address, String phone, String emailID, double balance) {
		super(accName, address, phone, emailID, balance);
	}
	
	public boolean legibility() {
	    if (super.getBalance() >= 500) {
	        return true;
	    } else {
	        return false;
	    }
	}

	

	public void payEMI(double amount){
	    if(loanBalance == 0) {
	    	System.out.println("You have no pending loan to pay");
	    }else {
	    	loanBalance = loanBalance - amount;
	    	System.out.println("Your loan bal = " + loanBalance);
	    }
	}
}
public class Student_Bank_Account {

	public static void main(String []Args) {
		
		Account acc1 = new Account("Emmanuel Asante", "Basket", "0572276893", "easante658@gmail.com", 1000);
		//System.out.println(acc1.toString());
		
		SavingsAccount sa = new SavingsAccount(acc1.getAccName(), acc1.getAddress(), acc1.getPhone(), acc1.getEmailID(), acc1.getBalance());
	    sa.deposit(1000);
		sa.withdraw(100);
		
		
		LoanAccount la = new LoanAccount(acc1.getAccName(), acc1.getAddress(), acc1.getPhone(), acc1.getEmailID(), acc1.getBalance());
	   System.out.println("\nYour eligibility for a loan is " + la.legibility());
		
	   
	   
	   //There is an something i need to understand here
	}
}
