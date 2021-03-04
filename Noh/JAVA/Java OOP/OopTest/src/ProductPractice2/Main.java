package ProductPractice2;

class Main {
	public static void main(String[] args) {
		//구매자가 와서 물건을 사려고 한다. 구매자는 Tv,Computer,Audio를 산다.
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
		
		//총 얼마인지 알려준다.
		//System.out.println("총 금액은 "+b.getMoney()+"만원입니다.");
		//System.out.println("현재 보너스점수는 "+b.getBonusPoint()+"점입니다.");				
	}
}
