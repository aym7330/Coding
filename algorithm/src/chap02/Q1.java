/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p56
 */
package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Random rand=new Random();	//랜덤 클래스
		
		System.out.println("키의 최댓값 구하기");
		int num=rand.nextInt(10)+1;
		System.out.println("사람 수 : "+num);
		
		int[] height=new int[num];
		
		for(int i=0;i<num;i++) {
			height[i]=100+rand.nextInt(90);	//요소의 값을 난수로 결정 
											// 0~n-1까지의 난수
			System.out.println("height[ "+i+" ]:"+height[i]);
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
