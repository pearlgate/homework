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
			System.out.println("1. 계좌개설\n2. 로그인\n3. 나가기");
			int choice = sc.nextInt();
			if(choice==3) {
				System.out.println("안녕히가세요.");
				break;
			}
			switch(choice) {
			case 1:
				//계좌개설
				System.out.println("1. 기업은행\n2. 신한은행\n3. 우리은행");
				test.call();
				test1.call();
				test2.call();
				test3.call();
				int bankChoice = sc.nextInt();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("비번 : ");
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
					System.out.println("잘못입력하셨습니다.");
				}
				break;
			case 2:
				//로그인
				System.out.print("계좌번호 : ");
				String account = sc.next();
				System.out.print("비밀번호 : ");
				pw = sc.next();
				Bank user = manager.login(account,pw);
				if(user == null) {
					System.out.println("로그인 실패");
				}else {
					System.out.println(user.getName() + "님 환영합니다.");
					while(true) {
						System.out.println("1. 입금하기\n2. 출금하기\n3. 잔액보기\n4. 로그아웃");
						choice = sc.nextInt();
						if(choice==4) {
							break;
						}
						switch(choice) {
						case 1:
							//1.입금 2.출금 3.잔액 4.로그아웃
							System.out.print("입금하실 금액 : ");
							int money = sc.nextInt();
							user.deposit(money);
							break;
						case 2:
							System.out.print("출금하실 금액 : ");
							money = sc.nextInt();
							int result = user.withdraw(money);
							System.out.println(result + "원 출금 완료");
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
