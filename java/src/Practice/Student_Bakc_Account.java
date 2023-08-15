package Practice;
class Account{
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

	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", address=" + address + ", phone=" + phone
				+ ", emailID=" + emailID + ", balance=" + balance + "]";
	}
}

class SavingsAccount extends Account{
	private double loanBalance;
	
	SavingsAccount(String accName, String address, String phone, String emailID, double balance) {
		super(accName, address, phone, emailID, balance);
	}
	

	
	@Override
	public String toString() {
		return "SavingsAccount [loanBalance=" + loanBalance + "]";
	}
	

}
class LoanAccount extends Account{
	
	private double loanBalance;
	
	LoanAccount(String accName, String address, String phone, String emailID, double balance) {
		super(accName, address, phone, emailID, balance);
	}
	
	public boolean legibility() {
		if(super.balance <= 20) {
			return false;
		}
		else{
			return true;
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
public class Student_Bakc_Account {

	public static void main(String []Args) {
		
	}
}
