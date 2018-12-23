/**
 * ��¥ : 2018-12-23
 * 
 * ������ : p117
 */
package chap03;

import java.util.Scanner;

public class Q5 {
	static int binSearchX(int[] a, int n, int key) {
		int pl=0;
		int pr=n-1;
		do {
			int pc=(pl+pr)/2;
			if(a[pc]==key) {
				for(int i=0;i<pc;i++) {
					if(a[i]==key)
						return i;
				}
			}
			else if(a[pc]>key)
				pr=pc-1;
			else 
				pl=pc+1;
				
		}while(pl<=pr);
		return -1;
	}
/*	static int binSearchX(int[] a, int n, int key) {
		int pl = 0; // �˻����� �� ���� index
		int pr = n - 1; // �˻����� �� ���� index

		do {
			int pc = (pl + pr) / 2; // �߾ӿ���� index
			if (a[pc] == key) {
				for (; pc > pl; pc--) // key�� ���� �� ���� ��Ҹ� ã���ϴ�
					if (a[pc - 1] < key)
						break;
				return pc; // �˻�����
			} else if (a[pc] < key)
				pl = pc + 1; // �˻������� ���� �������� ����
			else
				pr = pc - 1; // �˻������� ���� �������� ����
		} while (pl <= pr);

		return -1; // �˻�����
	}*/
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		System.out.println("������������ �Է��ϼ���");
		
		System.out.println("x[0] :");
		x[0]=stdIn.nextInt();
		
		for(int i=1; i<num;i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);	// �ٷ� ���� ��Һ��� ������ �ٽ� �Է�
		}
		
		System.out.println("�˻��� �� : ");
		int ky=stdIn.nextInt();
		
		int idx=binSearchX(x, num, ky);
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}
	
}
