package fighterTest;

abstract class Unit {
	
	int x, y;
	
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춤니다.");
	}
}
