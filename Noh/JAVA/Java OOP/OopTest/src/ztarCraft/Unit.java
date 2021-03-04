package ztarCraft;

abstract class Unit {
	//이동을 하기 위한 x,y좌표
	int x, y;

	private int max_Hp=1240;
	
	public int getMax_Hp() {
		return max_Hp;
	}
	
	abstract void move(int x, int y);
	void stop(){
		System.out.println("멈춥니다.");
	};
}
