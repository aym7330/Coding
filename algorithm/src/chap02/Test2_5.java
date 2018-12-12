/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p54
 * 
 * Random 클래스 : 난수 생성  
 */
package chap02;

import java.util.Random;
import java.util.Scanner;

public class Test2_5 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();	//랜덤 클래스
		
		System.out.println("키의 최댓값 구하기");
		System.out.println("사람 수 : ");
		int num=stdIn.nextInt();
		
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
