/**
 * 날짜 : 2018-12-19
 * 
 * 페이지 : p103
 * 
 * seqSearch를 for문의 구현
 * 
 * 무한 루프 => do~while은 권장하지 않음
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
		return -1; // 검색 실패(-1을 반환)

	}
}
