/**
 * 날짜 : 2018-12-13
 * 
 * 페이지 : p70
 */
package chap02;

public class Q6 {
	public static void main(String[] args) {
		
	}
	static int cardConv(int x, int r, char[] d)
	{
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++]=dchar.charAt(x%r); //digits++ 대입하고 증가
			x/=r;
		}while(x!=0);
		reverse(d);
		
/*		for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}*/

		return digits;
	}
		// 배열 요소를 교환
		static void swap(char[]a, int idx1, int idx2) {
			char t=a[idx1];
			a[idx1]=a[idx2];
			a[idx2]=t;
		}
		
		//역순으로 정렬
		static void reverse(char[] a) {
			for(int i=0; i<a.length/2;i++) {
				swap(a, i, a.length-i-1);
			}
		}
}
