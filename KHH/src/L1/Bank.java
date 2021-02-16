package L1;

public class Bank implements BankProduct{
	private String account;
	private String name;
	private String pw;
	private int balance;
	
	public Bank() {;}
	
	public Bank(String account, String pw, String name, int balance) {
		this.account = account;
		this.pw = pw;
		this.name = name;
		this.balance = balance;
	}
	
	public String getAccount() {
		return account;
	}

//	public void setAccount(String account) {
//		this.account = account;
//	}

	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public String getPw() {
		return pw;
	}
	
//	public void setPw(String pw) {
//		this.pw = pw;
//	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//잔액조회
	void showMoney() {
		System.out.println("계좌 번호 : " + account + "(" + name + " 님)");
		System.out.println("현재 잔액 : " + balance);
	}
	
	//입금
	void deposit(int money) {
		balance += money;
	}
	
	//출금
	int withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			return money;
		}
		return 0;
	}
	
	//계좌이체
	void send(String account, int money) {
		
	}

	@Override
	public void call() {
		System.out.println("각 은행마다 요구하는 조건이 다 다릅니다.");
	}

	@Override
	public void product() {
		System.out.println("각 은행마다 상품이 준비되어 있습니다.");
	}

}
