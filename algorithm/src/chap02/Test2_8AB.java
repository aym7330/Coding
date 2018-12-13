/**
 * ��¥ : 2018-12-13
 * 
 * ������ : p67, p69
 * 
 * 16���� 0,1,2, ...,9,A,B,C,D,E,F
 * 
 * 0x1C : 16����
 * 034 : 8����
 * 
 * String Ŭ���� (�⺻�� X)
 * : ���ڿ��� �־�α� ���� ���ڹ迭, ���� ���� ��Ÿ���� �ʵ� ���� ���� �ִ� Ŭ����
 * : �ʵ�, ������, �޼��� ���� ����
 * 
 * char charAt(int i)		�ε����� i�� ���� ���ڸ� ���� ��
 * int length()				���ڿ��� ���� ���� ���� ��
 * boolean equals(String s)	���� �� s�� �������� ����
 * 
 */

package chap02;

import java.util.Scanner;

public class Test2_8AB {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int no;						// ��ȯ�ϴ� ����
		int cd;						// ���
		int dno;					// ��ȯ ���� �ڸ���
		int retry;					// �ٽ� �ѹ�?
		char[] cno=new char[32]; 	// ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no=stdIn.nextInt();
			}while(no<0);
			
			do {
				System.out.println("� ������ ��ȯ�ұ��? (2~36) : ");
				cd=stdIn.nextInt();
			}while(cd<2||cd>36);
			
			dno=cardConvR(no, cd, cno);		// no�� cd������ ��ȯ
			
			System.out.print(cd+"�����δ� ");
			for(int i=dno-1;i>=0;i--) {		//���ڸ����� ���ʷ� ��Ÿ��
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��?(1.��/0.�ƴϿ�) : ");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
	
	static int cardConvR(int x, int r, char[] d) {
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++]=dchar.charAt(x%r); //digits++ �����ϰ� ����
			x/=r;
		}while(x!=0);
		return digits;
	}

}
