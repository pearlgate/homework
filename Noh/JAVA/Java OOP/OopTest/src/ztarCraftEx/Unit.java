package ztarCraftEx;

//유닛은 좌표로 이동할 수 있고, 멈출 수 있다.
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	abstract void stop();
}
