/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p34
 * 
 * 구조적 프로그래밍 : 하나의 입구와 하나의 출구를 가지고 구성 요소만을 계층적으로 배치하여 프로그램을 구성하는 방법
 * 				순차, 선택, 반복이라는 3종류의 제어 흐름 사용
 * 
 * 드모르간 법칙 : 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다.
 * 				!(no>=10 ||no<=99)
 */

package chap01;

import java.util.Scanner;

public class Test1C_2 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요. ");
		
		do {
			System.out.println("입력 : ");
			no=stdIn.nextInt();
		}while(no<10 ||no>99);
		
		System.out.println("변수 no의 값은 "+no+"가(이) 되었습니다.");

	}

}
