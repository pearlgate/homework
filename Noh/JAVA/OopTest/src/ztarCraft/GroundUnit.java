package ztarCraft;

//지상이동 하는 unit
abstract class GroundUnit extends Unit implements GroundFight{
	abstract void move(int x, int y);
	public abstract void attack(GroundFight gf);
}
