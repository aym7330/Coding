/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p48
 * 
 * 배열이름.clone() //배열의 복제
 */

package chap02;

public class Test2_3 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b=a.clone(); //b는 a의 복제를 참조
		b[3]=0;
		
		System.out.print("a =");
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		
		System.out.print("\nb =");
		for(int i=0;i<b.length;i++)
			System.out.print(" "+b[i]);
	}

}
