package ProductPractice;

class Product {
	private int price;
	private int bonusPoint;
	
	public int getPrice() {
		return price;
	}
	public int getbonusPoint() {
		return bonusPoint;
	}
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}	
}
