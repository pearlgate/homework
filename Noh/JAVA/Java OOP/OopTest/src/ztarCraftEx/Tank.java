package ztarCraftEx;

class Tank extends Unit {
	public void move(int x, int y) {
		System.out.println("Tank는" +"[x = " + x + ", y= "+y+"]로 이동되었습니다.");
	}
	public void stop() {
		System.out.println("Tank는 멈추었습니다.");
	}
}
