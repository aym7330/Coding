/**
 * ��¥ : 2018-12-23
 * 
 * ������ : p120
 * 
 * binarySearch �޼���
 * ����1 : ���� �˻� �޼��带 ���� �ڵ��� �ʿ䰡 ����.
 * ����2 : ��� �ڷ��� �迭���� �˻��� �� �ִ�.
 * �˻��� ������ ���  : key�� ��ġ�ϴ� ����� �ε����� ��ȯ, ��ġ�ϴ� ��Ұ� ������ �ִٸ� �������� �ε����� ��ȯ
 * �˻��� ������ ��� : ��ȯ���� ���� ����Ʈ�� x��� �� �� -x-1�� ��ȯ, ��������Ʈ�� �˻��ϱ� ���� ������ key���� ū��� �� ù��° ����� �ε���
 */
package chap03;

import java.util.*;

public class Test3_5 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		System.out.println("������������ �Է��ϼ���");
		
		System.out.println("x[0] : ");
		x[0]=stdIn.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("�˻��� �� : ");
		int ky=stdIn.nextInt();
		
		int idx=Arrays.binarySearch(x, ky);
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}

}