/**
 * ��¥ : 2018-12-12
 * 
 * ������ : p48
 */
package chap02;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("Ű�� �ִ� ���ϱ�");
		System.out.println("��� �� : ");
		int num=stdIn.nextInt();
		
		int[] height=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("height[ "+i+" ]:");
			height[i]=stdIn.nextInt();
		}
		System.out.println("�ִ��� "+maxOf(height)+"�Դϴ�.");
	}
	
	static int maxOf(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
}
