package ProductPractice;

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.getPrice();
		bonusPoint += p.getbonusPoint();
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}
