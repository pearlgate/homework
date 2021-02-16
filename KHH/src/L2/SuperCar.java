package L2;

public class SuperCar extends Car{
	String pw;
	
	public SuperCar() {
		super();
	}
	
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}
	
	void engineStart() {
		System.out.println(brand + " �������� �õ� �ѱ�");
	}
	
	void engineStop() {
		System.out.println(brand + " �������� �õ� ����");
	}
	
	void roofOpen() {
		System.out.println(brand + " �Ѳ�����");
	}
	
	void roofClose() {
		System.out.println(brand + " �Ѳ��ݱ�");
	}
}
