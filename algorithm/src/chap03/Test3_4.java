/**
 * ��¥ : 2018-12-19
 * 
 * ������ : p111
 * 
 * �����˻� : �������� �Ǵ� ������������ ���ĵ� �迭���� �˻��ϴ� �˰���
 * 		 : �߾Ӱ��� ���� �˻� ������ �پ��
 * 		=> �����˻����� �ӵ��� ����
 * 					�ʱ�ȭ
 * pl : �� ���� �ε���	0
 * pr : �� ���� �ε���	n-1
 * pc : �߾� �ε���		(n-1)/2
 * 
 * a[pc]<key : a[pc+1]~a[pr] => pl=pc+1�� ������Ʈ
 * a[pc]>key : a[pl]~a[pc-1] => pr=pc-1�� ������Ʈ
 * 
 * ���� ���� 
 * 1. a[pc]�� key�� ��ġ�ϴ� ���
 * 2. �˻� ������ �� �̻� ���� ���
 * 
 * �˻��� �ʿ��� �� Ƚ���� ��հ� : log n
 * => �˻��� �ݺ��� ������ �˻� ������ ������ ��
 * �˻��� ������ ��� : ��log(n+1)��
 * => ��x�� : õ�� �޼����, x���� ũ�ų� �����鼭 ���� ���� ����
 * �˻��� ������ ��� : �뷫 log n - 1
 */

package chap03;

import java.util.Scanner;

public class Test3_4 {

	static int binSearch(int[] a, int n, int key) {
		int pl=0;
		int pr=n-1;
		
		do {
			int pc=(pl+pr)/2;
			if(a[pc]==key)
				return pc;		// �˻� ����
			else if(a[pc]<key)	//�˻� ������ ���� ��������
				pl=pc+1;
			else
				pr=pc-1;		//�˻� ������ ���� ��������
		}while(pl<=pr);
		return -1;				// �˻� ����
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		System.out.println("������������ �Է��ϼ���");
		
		System.out.println("x[0] :");
		x[0]=stdIn.nextInt();
		
		for(int i=1; i<num;i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);	// �ٷ� ���� ��Һ��� ������ �ٽ� �Է�
		}
		
		System.out.println("�˻��� �� : ");
		int ky=stdIn.nextInt();
		
		int idx=binSearch(x, num, ky);
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}
}
