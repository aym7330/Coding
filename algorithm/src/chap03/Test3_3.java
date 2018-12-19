/**
 * ��¥ : 2018-12-19
 * 
 * ������ : p105
 * 
 * ���� ���� 
 * 1. �˻��� ���� �߰����� ���ϰ� �迭�� ���� ������ ��� => �˻� ����
 * 2. �˻��� ���� ���� ��Ҹ� �߰��� ��� => �˻� ����
 * 
 * ���ʹ� : ���� �˻��� ���� ������ �˻��ϴ� ����� ������ ���̴� ���
 * ���� : �˻��ϱ� ���� �˻��ϰ��� �ϴ� Ű ���� �� �� ��ҿ� ����, �� �� �����ϴ� ���� ���ʶ�� �Ѵ�.
 * 		=> ���� ����1�� �������� �ʾƵ� �ȴ�.
 */
package chap03;

import java.util.Scanner;

public class Test3_3 {
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		a[n]=key;			//���ʸ� �߰�
		while(true) {
			if(a[i]==key)
				break;
			i++;
		}
		return i==n?-1:i;
	}
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num=stdIn.nextInt();
		int[] x=new int[num+1];		//��ڼ� num+1
		
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"] :");
			x[i]=stdIn.nextInt();
		}
		
		System.out.println("�˻��� �� : ");
		int ky=stdIn.nextInt();
		
		int idx=seqSearchSen(x, num, ky);	//�迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
		}
}
