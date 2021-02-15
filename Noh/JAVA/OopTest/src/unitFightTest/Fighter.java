package fighterTest;

class Fighter extends Unit implements Fightable {
	//오버라이딩 규칙 : 조상(public)보다 접근제어자의 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]"+"로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
}
