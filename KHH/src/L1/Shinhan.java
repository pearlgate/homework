package L1;

public class Shinhan extends Bank{
	
	
	
	public Shinhan() {
	}

	public Shinhan(String account, String pw, String name, int balance) {
		super(account, pw, name, balance);
	}

	@Override
	int withdraw(int money) {
		money *= 2;
		return super.withdraw(money)/2;
	}
	
	public void call() {
		System.out.println("신한은행은 출금시에 2배가 듭니다.");
	}
	
	public void product() {
		System.out.println("내년 2월에 상품 출시 예정입니다.");
	}
}
