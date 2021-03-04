package fighterTest;

interface Fightable {
	
	public abstract void move(int x, int y);
	
	public abstract void attack(Fightable f);
}
