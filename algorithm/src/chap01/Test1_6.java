/**
 * ��¥ : 2018-12-11
 * 
 * ������ : p32
 * 
 * do�� while(�����) => �� �� ������ ������ ��� �ݺ��� �� ���� �Ǵ� => ���Ĺݺ���
 */
package chap01;

import java.util.Scanner;

public class Test1_6 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n;
		System.out.println("1���� n������ ���� ���ϱ�");
		
		do {
			System.out.println("n�� �� : ");
			n=stdIn.nextInt();
		}while(n<=0);
			
		int sum =0;
		for(int i=0;i<=n; i++)
			sum+=i;
		System.out.println("�� : "+sum);
	}
}
