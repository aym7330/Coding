/**
 * ��¥ : 2018-12-13
 * 
 * ������ : p75
 * 
 * Test2_9 �˰��� ���� : 2���� n-1������ � �Ҽ��ε� ����������� �ʴ´�.
 * �������� ������ Ƚ�� : 14622
 * 
 * => ���� ���� ��� �˰����� �ϳ��� �ƴϴ�
 * => ���� �˰����� �޸𸮸� ���� �䱸�Ѵ�.
 */

package chap02;

public class Test2_10 {

	public static void main(String[] args) {
		int counter=0;				// �������� Ƚ��
		int ptr=0;					// ã�� �Ҽ��� ����
		int[] prime =new int[500];	// �Ҽ��� �����ϴ� �迭
		prime[ptr++]=2;		
		
		for(int n=3;n<=1000;n+=2) {	// Ȧ����
			int i;
			for(i=1;i<ptr;i++) {	// �̹� ã�� �Ҽ��� ������ ��
				counter++;
				if(n%prime[i]==0)
					break;
			}
			if(ptr == i)			// ���������� ����������� ����
				prime[ptr++]=n;		//�Ҽ���� �迭�� ����
		}
		
		for(int i=0;i<ptr;i++) {	
			System.out.println(prime[i]);
		}
		System.out.println("�������� ������ Ƚ�� : "+counter);
	}

}
