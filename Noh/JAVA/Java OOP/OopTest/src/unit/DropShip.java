package ztarCraftEx;

class DropShip extends Unit {
	public void move(int x,int y) {
		System.out.println("DropShip은" +"[x = " + x + ", y= "+y+"]로 이동되었습니다.");
	}
	public void stop() {
		System.out.println("DropShip은 멈추었습니다.");
	}
}
