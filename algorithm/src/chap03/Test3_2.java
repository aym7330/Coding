/**
 * ��¥ : 2018-12-19
 * 
 * ������ : p103
 * 
 * seqSearch�� for���� ����
 * 
 * ���� ���� => do~while�� �������� ����
 * while(true){}
 * for(;;){}
 * do{}while(true);
 */

package chap03;

public class Test3_2 {

	static int seqSearch(int[] a, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key)
				return i;
		}
		return -1; // �˻� ����(-1�� ��ȯ)

	}
}
