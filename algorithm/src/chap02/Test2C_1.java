/**
 * ��¥ : 2018-12-14
 * 
 * ������ : p87
 * 
 * for-in��
 * : �迭 a�� ó������ ������ ��� ��Ҹ� �� ���� ��ĵ�մϴ�. ���� ���������� ���� �ָ��ϰ� �ִ� ��Ҹ� i��� ǥ���մϴ�.
 * 
 * ���� : �迭�� ��ڼ�(����)�� �����ϴ� ���� �� �� �ִ�.
 * 	  : iterator�� ���� ������� ��ĵ�� �� �ִ�.
 */

package chap02;

public class Test2C_1 {

	public static void main(String[] args) {
		double[] a= {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i=0;i<a.length;i++) 
			System.out.println("a["+i+"] = "+a[i]);

		double sum=0;
		
		for(double i:a)
			sum+=i;
		
		System.out.println("��� ����� ���� "+sum+"�Դϴ�.");
	}

}
