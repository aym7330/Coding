/**
 * ��¥ : 2018-12-11
 * 
 * ������ : p33
 */
package chap01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("n : ");
			n=stdIn.nextInt();
		}while(n<0);
		
		int i=1; //�ڸ���
		int k=10;
		double check;
		while(true)
		{
			check=(double)n/k;
			if(check<1)break;
			i++;
			k=k*10;
		}
		System.out.println(n+"�� "+i+"�ڸ��Դϴ�.");
		
/*		int no = 0; 			// �ڸ���
		while (n > 0) {
			n /= 10; 			// n�� 10���� ����
			no++;
		}*/


	}

}
