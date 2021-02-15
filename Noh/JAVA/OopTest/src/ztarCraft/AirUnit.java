package ztarCraft;

//움직일 수 있다.
abstract class AirUnit extends Unit {
	//unit의 move를 매개변수를 다르게 해서 오버라이딩
	abstract void move(int x, int y);
}
