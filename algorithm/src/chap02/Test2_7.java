/**
 * ��¥ : 2018-12-12
 * 
 * ������ : p62
 */

package chap02;
public class Test2_7 {

	public static void main(String[] args) {
		Object cls=new Q3();	//�Է¸޼��� ��������
		System.out.print("a�� ");
		int[] a=Q3.input();

		System.out.print("b�� ");
		int[] b=Q3.input();
		
		System.out.println("�迭 a�� b�� "+(equals(a,b)?"�����ϴ�.":"���� �ʽ��ϴ�."));
	}
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}

}
