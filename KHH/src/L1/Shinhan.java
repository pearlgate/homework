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
		System.out.println("���������� ��ݽÿ� 2�谡 ��ϴ�.");
	}
	
	public void product() {
		System.out.println("���� 2���� ��ǰ ��� �����Դϴ�.");
	}
}
