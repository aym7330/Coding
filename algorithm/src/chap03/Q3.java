/**
 * ��¥ : 2018-12-22
 * 
 * ������ : p117
 */

package chap03;

import java.util.Scanner;

public class Q3 {
	static int searchIdx(int[] a, int num, int key, int[] idx) {
		int n=0;
		for(int i=0;i<num;i++) {
			if(a[i]==key) {
				idx[n]=i;
				n++;
			}
		}
		return n;
	}
/*	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0; // key�� ���� ��ڼ�
		for (int i = 0; i < n; i++)
			if (a[i] == key)
				idx[count++] = i;
		return count;
	}*/
	
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"] :");
			x[i]=stdIn.nextInt();
		}
		
		System.out.println("�˻��� �� : ");
		int ky=stdIn.nextInt();
		
		int[] idx= new int[num];
		int n=searchIdx(x, num, ky, idx);	//�迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		System.out.println(n);
		
/*		if (n == 0)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			for (int i = 0; i < n; i++)
				System.out.println("�� ���� " + "x[" + idx[i] + "]�� �ֽ��ϴ�.");*/
		}
}
