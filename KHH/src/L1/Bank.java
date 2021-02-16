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
	
	//�ܾ���ȸ
	void showMoney() {
		System.out.println("���� ��ȣ : " + account + "(" + name + " ��)");
		System.out.println("���� �ܾ� : " + balance);
	}
	
	//�Ա�
	void deposit(int money) {
		balance += money;
	}
	
	//���
	int withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			return money;
		}
		return 0;
	}
	
	//������ü
	void send(String account, int money) {
		
	}

	@Override
	public void call() {
		System.out.println("�� ���ึ�� �䱸�ϴ� ������ �� �ٸ��ϴ�.");
	}

	@Override
	public void product() {
		System.out.println("�� ���ึ�� ��ǰ�� �غ�Ǿ� �ֽ��ϴ�.");
	}

}
