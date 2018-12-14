/**
 * ��¥ : 2018-12-14
 * 
 * ������ : p83
 */

package chap02;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.print("�� : "); int year=stdIn.nextInt(); // ��
			System.out.print("�� : "); int month=stdIn.nextInt(); // ��
			System.out.print("�� : "); int day=stdIn.nextInt(); // ��
			
			System.out.printf("�� �� %d��°�Դϴ�.\n",dayOfYear(year,month,day));
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
	static int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31},	// ���
			{31,29,31,30,31,30,31,31,30,31,30,31}	// ����
	};
	
	static int isLeap(int year) {	// ���� : 1	��� : 0
		return (year%4==0 && year%100 !=0 || year %400==0)? 1:0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		while ((m-2)>=0) { // 1������ (m-1)���� �� ���� �� ��
			d += mdays[isLeap(y)][m-2];
			m--;
		}
		return d;
	}
/*	static int dayOfYear(int y, int m, int d) {
		while (--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return (d);
	}*/

}
