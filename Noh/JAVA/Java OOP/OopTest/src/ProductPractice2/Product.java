package ProductPractice2;

//물건에는 가격, 포인트가 있다.
class Product {
	private int price;
	private int bonusPoint;
	
	int getPrice() {
		return price;
	}
	int getBonusPoint() {
		return bonusPoint;
	}
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
