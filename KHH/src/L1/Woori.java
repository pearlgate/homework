package L1;

public class Woori extends Bank{
	
	
	
	public Woori() {
	}

	public Woori(String account, String pw, String name, int balance) {
		super(account, pw, name, balance);
	}

	@Override
	void showMoney() {
		this.setBalance(getBalance()/2);
		super.showMoney();
	}
	
	public void call() {
		System.out.println("우리은행은 계좌 조회시에 절반이 줄어듭니다.");
	}
	
	public void product() {
		System.out.println("우리 은행은 상품 출시 예정이 없습니다.");
	}
}
