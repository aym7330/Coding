/**
 * 날짜 : 2018-12-19
 * 
 * 페이지 : p115
 * 
 * 복잡도 : 알고리즘의 성능을 객관적으로 평가하는 기준
 * 	1. 시간 복잡도 : 실행에 필요한 시간을 평가한 것
 *  2. 공간 복잡도 : 기억 영역과 파일 공간이 얼마나 필요한가를 평가한 것
 *  
 * O(n/2)이 아닌 O(n)으로 표현하는 이유 
 * : n의 값이 무한히 커진다고 가정했을 때, 그 값의 차이가 무의미해지기 때문이다.
 * O(100) => O(1)도 같은 원리 
 * 
 * 2개 이상의 복잡도로 구성된 알고리즘의 전체 복잡도 : 차원이 더 높은 쪽의 복잡도를 우선시 함
 * 
 * 선형 검색 : O(n)
 * 이진 검색 : O(log n)
 * 
 * 
 * 복잡도의 대소 관계
 * 1	log n	n	nlog n	n^2		n^k		2^n
 * 
 */

package chap03;

public class Q1 {
	static int seqSearchSenFor(int[] x,int n,int key) {
		x[n]=key;
		for(int i=0;i<=n;i++) {
			if(x[i]==key&&i!=n)
				return i;
		}
		return -1;
	}
/*	static int seqSearchSen(int[] a, int n, int key) {
		int i;
		a[n] = key; // 보초를 추가

		for (i = 0; a[i] != key; i++);
		
		return i == n ? -1 : i;
	}*/

}
