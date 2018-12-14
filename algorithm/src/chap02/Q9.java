/**
 * ��¥ : 2018-12-14
 * 
 * ������ : p83
 */

package chap02;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.print("�� : "); int year=stdIn.nextInt(); // ��
			System.out.print("�� : "); int month=stdIn.nextInt(); // ��
			System.out.print("�� : "); int day=stdIn.nextInt(); // ��
			
			System.out.printf("�� �� ���� �� ���� %d�Դϴ�.\n", leftDayOfYear(year,month,day));
			
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
	
	static int leftDayOfYear(int y, int m, int d) {
		int days=d;
		
		for(int i=1; i<m;i++)	// 1������ (m-1)���� �� ���� �� ��
			days += mdays[isLeap(y)][i-1];	
		
		if(isLeap(y)==0)
		return 365-days;	
		else
		return 366-days;
	}
/*	static int leftDayOfYear(int y, int m, int d) {
		int days = d; // �ϼ�

		for (int i = 1; i < m; i++) // 1��~(m-1)���� �� ���� ����
			days += mdays[isLeap(y)][i - 1];
		return 365 + isLeap(y) - days;
	}*/
}
