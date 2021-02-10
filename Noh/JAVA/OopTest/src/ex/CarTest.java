package ex;

class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrr~~~~");
	}
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!");
	}
}




public class CarTest {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.color="yellow";
		fe.water();
		//c.water(); 불가능 왜? 조상 Car타입의 참조변수 c가 가리키는 객체(FireEngine)에는 water()가 있지만 타입이 Car라서 가리킬 수 없다.
		
		fe2 = (FireEngine)car;
		fe2.water();
		
		((FireEngine) car).water();
		
		
	}

}
