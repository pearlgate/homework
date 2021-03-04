package ztarCraft;

class Scv extends GroundUnit implements Repairable {
	void move(int x,int y) {
		System.out.println("["+x+","+y+"]로 Scv가 이동되었습니다.");
	}
	
	public void attack(GroundFight gf) {
		System.out.println(gf+"가 공격합니다.");
	}
	
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(hitPoint !=u.getMax_Hp()) {
				hitPoint++;
			}
			System.out.println("Scv가 치유되고 있습니다.");
		}

	}
}
