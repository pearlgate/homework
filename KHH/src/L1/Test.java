package L1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Bank Test");
		
		Scanner sc = new Scanner(System.in);
		Bank test = new Bank();
		Kiup test1 = new Kiup();
		Shinhan test2 = new Shinhan();
		Woori test3 = new Woori();
		
		BankManager manager = new BankManager();
		
		while(true) {
			System.out.println("1. ���°���\n2. �α���\n3. ������");
			int choice = sc.nextInt();
			if(choice==3) {
				System.out.println("�ȳ���������.");
				break;
			}
			switch(choice) {
			case 1:
				//���°���
				System.out.println("1. �������\n2. ��������\n3. �츮����");
				test.call();
				test1.call();
				test2.call();
				test3.call();
				int bankChoice = sc.nextInt();
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("��� : ");
				String pw = sc.next();
				manager.create(bankChoice, name, pw);
				test.product();
				if(bankChoice == 1) {
					test1.product();
				}else if(bankChoice == 2) {
					test2.product();
				}else if(bankChoice == 3) {
					test3.product();
				}else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
				break;
			case 2:
				//�α���
				System.out.print("���¹�ȣ : ");
				String account = sc.next();
				System.out.print("��й�ȣ : ");
				pw = sc.next();
				Bank user = manager.login(account,pw);
				if(user == null) {
					System.out.println("�α��� ����");
				}else {
					System.out.println(user.getName() + "�� ȯ���մϴ�.");
					while(true) {
						System.out.println("1. �Ա��ϱ�\n2. ����ϱ�\n3. �ܾ׺���\n4. �α׾ƿ�");
						choice = sc.nextInt();
						if(choice==4) {
							break;
						}
						switch(choice) {
						case 1:
							//1.�Ա� 2.��� 3.�ܾ� 4.�α׾ƿ�
							System.out.print("�Ա��Ͻ� �ݾ� : ");
							int money = sc.nextInt();
							user.deposit(money);
							break;
						case 2:
							System.out.print("����Ͻ� �ݾ� : ");
							money = sc.nextInt();
							int result = user.withdraw(money);
							System.out.println(result + "�� ��� �Ϸ�");
							break;
						case 3:
							user.showMoney();
							break;
						}
					}
				}
				break;
				
			}
		}
	}
}
