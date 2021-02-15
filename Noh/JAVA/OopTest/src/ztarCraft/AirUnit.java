package ztarCraft;

//지상 유닛과 다르게 움직일 수 있다.
abstract class AirUnit extends Unit {
	int hitPoint = 5;
	
	abstract void move(int x, int y);
}
