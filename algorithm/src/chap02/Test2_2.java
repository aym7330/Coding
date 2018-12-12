/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p47
 * 
 * 초깃값	
 * int : 0
 * char : '\u0000'
 * boolean : false
 * 참조형 : 공백 참조 또는 null
 * 
 *메서드 안에서 선언한 지역 변수는 초깃값으로 초기화되지 않는다.
 */
package chap02;

public class Test2_2 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) 
			System.out.println("a["+i+"] = "+a[i]);
	}

}
