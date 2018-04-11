package netbanking;
class DepositThread extends Thread{
	Account tacct;
	double tamt;
	public DepositThread(Account tacct, double tamt) {
		this.tacct = tacct;
		this.tamt = tamt;
	}
	
	public void run() {
		tacct.deposit(tamt);
	}
}
class WithdrawlThread extends Thread{
	Account tacct;
	double tamt;
	public WithdrawlThread(Account tacct, double tamt) {
		this.tacct = tacct;
		this.tamt = tamt;
	}
	
	public void run() {
		tacct.withdrawl(tamt);
	}
}
public class Account {
	int accounNumber; 
	double balance;
	String acctName;
	public Account(int accounNumber, double balance, String acctName) {
		super();
		this.accounNumber = accounNumber;
		this.balance = balance;
		this.acctName = acctName;
	}
	public synchronized void  withdrawl(double amt) {
		if(amt > balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance = balance - amt;
			System.out.println("Withdrawl Successfull |Withdrawl AMt:" +amt+" | Current Balance" + balance );
		}
	}
	
	public synchronized void deposit(double amt) {
		balance = balance + amt;
		System.out.println("Deposit Successfull : Deposit AMt:" +amt+" | Current Balance: " + balance );
	}
	
	public double checkBalance() {
		return balance;
	}

}
