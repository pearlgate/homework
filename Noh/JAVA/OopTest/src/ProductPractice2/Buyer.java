package ProductPractice2;

//구매자는 현금과 포인트를 가지고 있고 물건을 살 수 있다.
//돈이 없으면 물건을 살 수 없다.
class Buyer {
	private int money = 1000;
	private int bonusPoint;
	Product[] cart = new Product[10]; //구입한 제품들을 담을 배열(장바구니)
	int i = 0; //장바구니 아이템 갯수를 센다.
	
	int getMoney(){
		return money;
	}
	int getBonusPoint() {
		return bonusPoint;
	}
	
	//참조형 매개변수는 메서드 호출 시 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨 줄 수 있다.
	void buy(Product p){
		//산다는 행위는 산다||못산다로 구분한다. 이 경우는 돈이 부족하여 물건을 살 수 없는 경우이다.
		if(money < p.getPrice()) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;			
		}
		
		//물건을 살 경우에는 소지금에서 가격만큼 뺀다. 포인트는 더해준다.
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		//장바구니에 물건을 담는다.
		cart[i++] = p;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	void summary() {
		// TODO Auto-generated method stub
		int sum = 0; //구입한 물품의 가격합계
		String itemList=""; //구입한 물품목록
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].getPrice();
			itemList += cart[i]+" , ";
		}
		System.out.println("구입한 총 금액은 "+sum+"만원입니다.");
		System.out.println("구입한 물품은 "+itemList+"입니다.");
	}
}
