package L2;

public class Road {
	public static void main(String[] args) {
		Car noOptionFerrari = new SuperCar("Ferrari","Red",60000);
		noOptionFerrari.engineStart();
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.roofOpen();
		
//		SuperCar mycar = new SuperCar("Ferrari", "Red", 60000);
//		Car momcar = new Car("K7", "White", 6000);
//		SuperCar dadcar = new SuperCar("RollsRoyce", "Purple", 50000);
		
		Car[] garge = {
				new SuperCar("Ferrari","Red",60000),
				new Car("K7", "White", 6000),
				new SuperCar("RollsRoyce", "Purple", 50000)
		};
		
//		garge[0].engineStart();
		for (int i = 0; i < garge.length; i++) {
			if(garge[i] instanceof SuperCar) {
				SuperCar car = (SuperCar)garge[i];
				car.roofOpen();
			}
		}
	}
}
