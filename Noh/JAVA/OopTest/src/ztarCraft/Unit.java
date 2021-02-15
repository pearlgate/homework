package ztarCraft;

abstract class Unit {
	//이동을 하기 위한 x,y좌표
	int x, y;
	
	int hitPoint;
	int max_Hp=1240;
	
	abstract void move(int x, int y);
	void stop(){
		System.out.println("멈춥니다.");
	};
}
