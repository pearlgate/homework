package ztarCraftEx;

class Main {

	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new DropShip()};
		
		for(int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}

	}

}
