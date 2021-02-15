package ztarCraft;

class Dropship extends AirUnit implements Repairable {
	int i = 0;
	GroundUnit[] gu = new GroundUnit[10];
	
	void move(int x,int y) {
		System.out.println("["+x+","+y+"]로 Dropship이 이동되었습니다.");
	}
	
	//dropship은 유닛을 태울 수 있다.
	//유닛은 GroundUnit을 태울 수 있다.
	void loadUnit(GroundUnit gu) {
		this.gu[i++] = gu;
		System.out.println(gu+"을 태웠습니다.");
	}
	
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(hitPoint !=u.getMax_Hp()) {
				hitPoint++;
			}
			System.out.println("DropShip이 치유되고 있습니다.");
		}
	}
}
