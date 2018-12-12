/**
 * ��¥ : 2018-12-12
 * 
 * ������ : p54
 * 
 * Random Ŭ���� : ���� ����  
 */
package chap02;

import java.util.Random;
import java.util.Scanner;

public class Test2_5 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();	//���� Ŭ����
		
		System.out.println("Ű�� �ִ� ���ϱ�");
		System.out.println("��� �� : ");
		int num=stdIn.nextInt();
		
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
