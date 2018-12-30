package chap04;

import java.util.Scanner;

public class Test4_4 {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		Test4_3 s= new Test4_3(64);
		
		while(true) {
			System.out.println("���� ������ �� : "+s.size()+"/"+s.capacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)����  (0)���� :");
			int menu=stdIn.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.println("������ :");
				x=stdIn.nextInt();
				try {
					s.enque(x);
				}catch(Test4_3.OverflowIntQueueException e) {
				System.out.println("ť�� ���� á���ϴ�.");
			}
				break;
				
			case 2:
				try {
					x=s.deque();
					System.out.println("��ť�� �����ʹ� "+x+"�Դϴ�.");
				}catch(Test4_3.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("��ũ�� �����ʹ�"+x+"�Դϴ�.");
				}catch(Test4_3.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
				
			case 4:
				s.dump();
				break;
			
			}
		}
	}
}


