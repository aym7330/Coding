/**
 * ��¥ : 2018-12-12
 * 
 * ������ : p48
 * 
 * �迭�̸�.clone() //�迭�� ����
 */

package chap02;

public class Test2_3 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b=a.clone(); //b�� a�� ������ ����
		b[3]=0;
		
		System.out.print("a =");
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		
		System.out.print("\nb =");
		for(int i=0;i<b.length;i++)
			System.out.print(" "+b[i]);
	}

}
