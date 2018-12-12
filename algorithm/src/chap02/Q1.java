/**
 * ��¥ : 2018-12-12
 * 
 * ������ : p56
 */
package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Random rand=new Random();	//���� Ŭ����
		
		System.out.println("Ű�� �ִ� ���ϱ�");
		int num=rand.nextInt(10)+1;
		System.out.println("��� �� : "+num);
		
		int[] height=new int[num];
		
		for(int i=0;i<num;i++) {
			height[i]=100+rand.nextInt(90);	//����� ���� ������ ���� 
											// 0~n-1������ ����
			System.out.println("height[ "+i+" ]:"+height[i]);
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
