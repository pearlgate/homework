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
		System.out.println(brand + " À½¼ºÀ¸·Î ½Ãµ¿ ÄÑ±â");
	}
	
	void engineStop() {
		System.out.println(brand + " À½¼ºÀ¸·Î ½Ãµ¿ ²ô±â");
	}
	
	void roofOpen() {
		System.out.println(brand + " ¶Ñ²±¿­±â");
	}
	
	void roofClose() {
		System.out.println(brand + " ¶Ñ²±´Ý±â");
	}
}
