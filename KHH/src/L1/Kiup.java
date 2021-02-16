package L1;

public class Kiup extends Bank{
	
	public Kiup() {
	}

	public Kiup(String account, String pw, String name, int balance) {
		super(account, pw, name, balance);
	}

	@Override
	void deposit(int money) {
		money/=2;
		super.deposit(money);
	}
	
	public void call() {
		System.out.println("기업 은행은 입금시에 절반을 가져갑니다.");
	}
	
	public void product() {
		System.out.println("기업 은행은 상품 준비중 입니다.");
	}
}
