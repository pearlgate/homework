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
		System.out.println("��� ������ �Աݽÿ� ������ �������ϴ�.");
	}
	
	public void product() {
		System.out.println("��� ������ ��ǰ �غ��� �Դϴ�.");
	}
}
