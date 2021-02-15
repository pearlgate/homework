package ztarCraft;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AirUnit의 이동
		AirUnit au = new Dropship();
		au.move(200, 100);
		
		
		//GroundUnit gu = new Marine();
		GroundUnit gu = new Tank();
		//GroundUnit이동과 공격
		gu.move(200, 100);
		gu.attack(gu);
		
		//Repairable를 구현한 객체들 치유
		Scv scv = new Scv();
		scv.repair(scv);
		
		Dropship ds = new Dropship();
		ds.repair(ds);
		
		Tank t = new Tank();
		t.repair(t);
		
	}

}
