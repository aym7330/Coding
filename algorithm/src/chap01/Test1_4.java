/**
 * ��¥ : 2018-12-11
 * 
 * ������ : p27, p29
 * 
 * �ݺ�����(����) : � ������ �����ϴ� ���� ó���� �ݺ��Ͽ� �����ϴ� ��
 * 
 * while(�����)��ɹ� => ���� �Ǵ� �ݺ� ����
 * for(�ʱ�ȭ �κ�; �����; ������Ʈ �κ�)��ɹ�
 * 
 */
package chap01;

import java.util.Scanner;

public class Test1_4 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);		
		System.out.println("1-n������ ��");
		System.out.println("n : ");		
		int n =stdIn.nextInt();		
		int sum=0;
		
		
		int i=1;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		/*
		 * for(int i=1;i<=n;i++)
		 * sum+=i;
		 */
		// while���� i=n+1�̰� for���� i=n�̴�.
		
		System.out.println("1-"+n+"������ �� : "+sum);
	}
}
