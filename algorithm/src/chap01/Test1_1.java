/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p13
 * 
 * 순차적 구조 : 여러 문장(프로세스)이 순차적으로 실행되는 구조 
 * 선택구조 : 결과에 따라 프로그램의 실행 흐름을 변경하는 구조
 * 
 * next() : 문자열(스페이스, 줄바꿈 문자로 구분)
 * nextLine() : 문자열 1줄
 * 
 * 알고리즘 : 문제를 해결하기 위한 거스올, 명확하게 정의되고 순서가 있는 유한 개의 규직으로 이루어진 집합
 * 
 */
package chap01;
import java.util.*;
class Test1_1 {
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in); // System.in 키보드와 연결된 표준 입력 스트림
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a : "); int a= stdIn.nextInt(); // stdIn.nextInt() 키보드로 정수값 입력
		System.out.println("b : "); int b= stdIn.nextInt(); // stdIn은 표준 입력 스트림에서 문자와 숫자를 꺼내는 장치 역할을 함
		System.out.println("c : "); int c= stdIn.nextInt();
		
		int max= a;
		if(b>max)max=b;
		if(c>max)max=c;
		
		System.out.println("최댓값은 "+max+"입니다.");
		System.out.println("-------------------------------------");
		System.out.println("max3(3,2,1)= "+max3(3,2,1));
	}
	
	static int max3(int a, int b, int c) { // 매개변수 : 메서드를 정의할 때 메서드에 전달되는 값을 저장하기 위한 변수
		int max=a;
		if(b>max)max=b;
		if(c>max)max=c;
		
		return max;
	}
}


