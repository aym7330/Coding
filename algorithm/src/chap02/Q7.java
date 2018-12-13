/**
 * ��¥ : 2018-12-13
 * 
 * ������ : p70
 */
package chap02;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int no;
		int cd;	
		char[] cno=new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		
		do {
			System.out.println("���� �ƴ� ���� : ");
			no=stdIn.nextInt();
		}while(no<0);
		
		do {
			System.out.println("� ������ ��ȯ�ұ��?(2-36) : ");
			cd=stdIn.nextInt();
		}while(cd<2||cd>36);
		
		//printCardConv(no, cd, cno);
		cardConvEx(no, cd, cno);
	}
	
	static void printCardConv(int no, int r, char[] d) {
		System.out.printf("%2d| %5d",r,no);
		System.out.println("\n  +-------");
		
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while(true) {
			d[digits]=dchar.charAt(no%r);
			no=no/r;
			if(no==0) {
				System.out.printf(" %7d  *** %2c",no,d[digits]);
				break;
			}
			System.out.printf("%2d|%5d  *** %2c",r,no,d[digits]);
			System.out.println("\n  +-------");
			digits++;
		}
	}
	
	static int cardConvEx(int x, int r, char[] d) {
		int n = ((Integer) x).toString().length(); // ��ȯ ���� �ڸ���
		int digits = 0; // ��ȯ ���� �ڸ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		do {
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();

			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    �� %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    �� %%d\n", n), x / r, x % r);
			d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
			char temp = d[i]; // �� �������� ����
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	}
}
