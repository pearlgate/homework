package ztarCraft;

public class Marine extends GroundUnit{

	public void move(int x,int y) {
		System.out.println("["+x+","+y+"]로 Marine이 이동되었습니다.");
	}
	public void attack(GroundFight gf) {
		System.out.println(gf.toString()+"이 공격합니다.");
	}
	
}
