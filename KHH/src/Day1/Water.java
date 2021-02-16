package Day1;

import java.util.Scanner;

abstract public class Water implements Delivery{
	private String name;
	private int price;
	private int fresh;
	
	Scanner sc = new Scanner(System.in);

	public void inTime() {
		System.out.println("제 시간안에 배달이 도착합니다.");
	}

	public void lateTime() {
		System.out.println("배달이 늦습니다.");
	}

	public int getFresh() {
		return fresh;
	}
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("이 물은 " + name + " 이고, 가격은 " + price + " 이며, 신선도는 " + fresh + " 이다.");
		devTime();
	}
	
	public void tasteInfo() {
		System.out.println("맛이 없다.");
	}
	public static void abc() {
		System.out.println("ㅁㅁㅁㅁ");
	}
	
	public void devTime() {
		System.out.print("배달소요 시간을 입력하세요. : ");
		int a = sc.nextInt();
		if(a <= 30) {
			inTime();
		}
		else if (a > 30) {
			lateTime();
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
