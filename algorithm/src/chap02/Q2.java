/**
 * ��¥ : 2018-12-12
 * 
 * ������ : p61
 */

package chap02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num=stdIn.nextInt();
		
		int[] x=new int[num];
		
		for(int i=0; i<num;i++) {
			System.out.println("x["+i+"] : ");
			x[i]=stdIn.nextInt();
		}
		reverse(x);
	}
	
	// �迭 ��Ҹ� ��ȯ
	static void swap(int[]a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	//�������� ����
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2;i++) {
			for(int j=0; j<a.length;j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
			System.out.println("a["+i+"]��(��) a["+(a.length-i-1)+"]�� ��ȯ");
			swap(a, i, a.length-i-1);

		}
		for(int j=0; j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println("\n���� ���� ����");
	}

/*	// �迭 a�� ��� ���� ��Ÿ��
		static void print(int[] a) {
			for (int i = 0; i < a.length; i++)
				System.out.print(a[i] + " ");
			System.out.println();
		}

		// �迭 a�� ��Ҹ� �������� ����
		static void reverse(int[] a) {
			print(a);
			for (int i = 0; i < a.length / 2; i++) {
				System.out.println("a[" + i + "]�� a[" + (a.length - i - 1) + "]�� ��ȯ�մϴ�.");
				swap(a, i, a.length - i - 1);
				print(a);
			}*/
}
