package L1;

import java.util.Random;

public class BankManager {
	static Bank[][] arUser = new Bank[3][1000]; //null
	static int[] arCnt = new int[3]; // 0
	//���,����,�츮  ��
	//0   1   2
	void create(int bankChoice, String name, String pw) {
		Random r = new Random();
		String account = r.nextInt(90000) + 10000 + "";
		while(true) {
			boolean flag = true;
			for(int i = 0; i < 3; i ++) {
				for(int j = 0; j < arCnt[i]; j++) {
					if(arUser[i][j].getAccount().equals(account)) {
						account = r.nextInt(90000) + 10000 + "";
						flag = false;
						break;
					}
				}
				if(!flag) {
					break;
				}
				
			}
			if(flag) {
				break;
			}
		}
		
		Bank[] creator = {
				new Kiup(account, pw, name, 0),
				new Shinhan(account, pw, name, 0),
				new Woori(account, pw, name, 0)};
		arUser[bankChoice-1][arCnt[bankChoice-1]] = creator[bankChoice-1];
		
		arCnt[bankChoice-1]++;
		System.out.println(name + "�� ���°��� �Ϸ�.\n ���¹�ȣ: " + account);
	}

	public Bank login(String account, String pw) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <arCnt[i]; j++) {
				if(arUser[i][j].getAccount().equals(account)) {
					if(arUser[i][j].getPw().equals(pw)) {
						//�α��� ����
						return arUser[i][j];
					}
				}
			}
		}
		return null;
	}

}
