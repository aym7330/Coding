/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p63
 */

package chap02;

public class Q4_5 {

	public static void main(String[] args) {		
		System.out.print("b의 ");
		int[] b=Q3.input(); //입력메서드 가져오기
		int[] a=new int[b.length];
		System.out.println("Q5");
		copy(a,b);
		System.out.println();
		System.out.println("Q6");
		rcopy(a,b);
	}
	static void printA(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	static void copy(int[] a, int[] b) {
		a=b.clone();
		System.out.println("a 배열 ");
		printA(a);
		System.out.println("\nb 배열 ");
		printA(b);
	}
	static void rcopy(int[] a, int[] b) {
		a=b.clone();
		Test2_6.reverse(a);
		System.out.println("\na 배열 ");
		printA(a);
		System.out.println("\nb 배열 ");
		printA(b);
	}
/*	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[b.length - i - 1];
	}*/

}
