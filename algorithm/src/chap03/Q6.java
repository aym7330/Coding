/**
 * ��¥ : 2018-12-23
 * 
 * ������ : p121
 */

package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
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
		
		if(idx<=-1) {
			idx=idx+1;
			idx=-idx;
			System.out.println("��������Ʈ�� +"+idx+"�Դϴ�.");
		}
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
/*		if (idx < 0) {
			int insPoint = -idx - 1;
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
			System.out.printf("���� ����Ʈ�� %d�Դϴ�.\n", insPoint);
			System.out.printf("x[%d]�� �ٷ� �տ� %d�� �����ϸ� �迭�� ���� ���°� �����˴ϴ�.", insPoint, ky);
		} else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");*/
	}
}
