/**
 * 날짜 : 2018-12-14
 * 
 * 페이지 : p87
 * 
 * for-in문
 * : 배열 a의 처음부터 끝까지 모든 요소를 한 개씩 스캔합니다. 루프 본문에서는 현재 주목하고 있는 요소를 i라고 표현합니다.
 * 
 * 장점 : 배열의 요솟수(길이)를 조사하는 수고를 덜 수 있다.
 * 	  : iterator와 같은 방법으로 스캔할 수 있다.
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
		
		System.out.println("모든 요소의 합은 "+sum+"입니다.");
	}

}
