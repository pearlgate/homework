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
		System.out.println("�츮������ ���� ��ȸ�ÿ� ������ �پ��ϴ�.");
	}
	
	public void product() {
		System.out.println("�츮 ������ ��ǰ ��� ������ �����ϴ�.");
	}
}
