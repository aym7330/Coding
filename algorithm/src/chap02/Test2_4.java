/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p48
 * 
 * 접급 제한자 종류
 * public : 모든 접근 허용
 * protected : 같은 패키지(폴더)의 객체, 상속 관계의 객체 허용
 * default : 같은 패키지(폴더)의 객체 허용
 * private : 현재의 객체 안에서만 허용
 * 
 * 접급 제한자 사용
 * 클래스 : public, default
 * 생성자, 멤버 변수, 멤버 메서드 : public, protected, default, private
 * 지역변수 : 접군 제한자를 사용할 수 없음
 * 
 */
package chap02;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("키의 최댓값 구하기");
		System.out.println("사람 수 : ");
		int num=stdIn.nextInt();
		
		int[] height=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("height[ "+i+" ]:");
			height[i]=stdIn.nextInt();
		}
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}
	
	static int maxOf(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
}
