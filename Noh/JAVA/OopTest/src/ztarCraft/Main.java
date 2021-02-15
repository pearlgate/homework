package ztarCraft;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AirUnit의 이동
		AirUnit au = new Dropship();
		au.move(200, 100);
		
		
		//GroundUnit gu = new Marine();
		GroundUnit[] gu = new GroundUnit[10];
		gu[0] = new Scv();
		gu[1] = new Tank();
		gu[2] = new Marine();
		Dropship ds = new Dropship();
		ds.loadUnit(gu[2]);
 		
//		GroundUnit gu = new Scv();
		//GroundUnit이동과 공격
		gu[0].move(200, 100);
		gu[1].attack(gu[2]);
		
		//Repairable를 구현한 객체들 치유
		Scv scv = new Scv();
		scv.repair(scv);
		
		Dropship repairDs = new Dropship();
		ds.repair(repairDs);
		
		
		Tank t = new Tank();
		t.repair(t);
		
		
		
	}

}
