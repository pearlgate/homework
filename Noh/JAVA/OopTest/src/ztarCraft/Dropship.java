package ztarCraft;

class Dropship extends AirUnit implements Repairable {
	
	void move(int x,int y) {
		System.out.println("["+x+","+y+"]로 Dropship이 이동되었습니다.");
	}
	
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint !=u.max_Hp) {
				u.hitPoint++;
			}
			System.out.println("DropShip이 치유되고 있습니다.");
		}
	}
}
