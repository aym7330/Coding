/**
 * ��¥ : 2018-12-13
 * 
 * ������ : p78
 * 
 * ������ �������� ������ Ƚ�� : 3774
 */

package chap02;

public class Test2_11 {

	public static void main(String[] args) {
		int counter=0;				// �������� Ƚ��
		int ptr=0;					// ã�� �Ҽ��� ����
		int[] prime =new int[500];	// �Ҽ��� �����ϴ� �迭
		prime[ptr++]=2;		
		prime[ptr++]=3;	
		
		for(int n=5;n<=1000;n+=2) {	// Ȧ����
			boolean flag=false;
			for(int i=1;prime[i]*prime[i]<=n;i++) {	// �̹� ã�� �Ҽ��� ������ ��
				counter+=2;							// prime[i]*prime[i], n%prime[i]
				if(n%prime[i]==0) {
					flag=true;
					break;
			}

		}
		
			if(!flag) {
				prime[ptr++]=n;
				counter++;	// prime[i]*prime[i]<=n �������� ���� ��쿡 �� ������ ����Ƚ���� ���Ե��� ����
			}
		}
		for(int i=0;i<ptr;i++) 
			System.out.println(prime[i]);
		
		System.out.println("������ �������� ������ Ƚ�� : "+counter);
		}
	}


