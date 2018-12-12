/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p44
 * 
 * 자료구조 : 데이터 단위와 데이터 자체 사이의 물리적 또는 논리적인 관계
 * 			=> 자료를 효율적으로 이용할 수 있도록 컴퓨터에 저장하는 방법
 * 배열 : 같은 자료형의 변수로 이루어진 구성 요소가 모인 것
 * 		int[] a;
 * 		int a[];
 * 
 * 		a=new int[5]
 * 			new 연산자 생성 : 배열 본체를 생성하는 본체에 대한 참조를 생성
 * 				배열 변수 이름[인덱스] 인덱스 => 0~n-1
 * 				배열의 구성 요소수 = 배열의 길이
 */

package chap02;

public class Test2_1 {

	public static void main(String[] args) {
		int[] a=new int[5];
		
		a[1]=37;
		a[2]=51;
		a[4]=a[1]*2;
		
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"] = "+a[i]);
	}

}
