package ztarCraftEx;

//마린은 유닛이다. 마린은 지상에서 움직을 수 있다.
class Marine extends Unit {
	public void move(int x, int y) {
		System.out.println("Marine은" +"[x = " + x + ", y= "+y+"]로 이동되었습니다.");
	}
	public void stop() {
		System.out.println("Marine은 멈추었습니다.");
	}
}
