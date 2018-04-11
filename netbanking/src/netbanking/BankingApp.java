package netbanking;

public class BankingApp {
	public static void main(String[] args) {
		Account cust1 = new Account(26262012, 10000.0, "LPU");
		DepositThread td1 = new DepositThread(cust1,2000);
		DepositThread td2 = new DepositThread(cust1,3000);
		DepositThread td3 = new DepositThread(cust1,4000);
		WithdrawlThread tw1 = new WithdrawlThread(cust1, 2000);
		WithdrawlThread tw2 = new WithdrawlThread(cust1, 6000);
		WithdrawlThread tw3 = new WithdrawlThread(cust1, 8000);
		// Six Transactions
		td1.start();
		td2.start();
		td3.start();
		tw1.start();
		tw2.start();
		tw3.start();
	}
}
