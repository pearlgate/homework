package Day1;

import java.util.Scanner;

abstract public class Water implements Delivery{
	private String name;
	private int price;
	private int fresh;
	
	Scanner sc = new Scanner(System.in);

	public void inTime() {
		System.out.println("�� �ð��ȿ� ����� �����մϴ�.");
	}

	public void lateTime() {
		System.out.println("����� �ʽ��ϴ�.");
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
		System.out.println("�� ���� " + name + " �̰�, ������ " + price + " �̸�, �ż����� " + fresh + " �̴�.");
		devTime();
	}
	
	public void tasteInfo() {
		System.out.println("���� ����.");
	}
	public static void abc() {
		System.out.println("��������");
	}
	
	public void devTime() {
		System.out.print("��޼ҿ� �ð��� �Է��ϼ���. : ");
		int a = sc.nextInt();
		if(a <= 30) {
			inTime();
		}
		else if (a > 30) {
			lateTime();
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
