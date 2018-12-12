/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p60
 */

package chap02;

import java.util.Scanner;

public class Test2_6 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num=stdIn.nextInt();
		
		int[] x=new int[num];
		
		for(int i=0; i<num;i++) {
			System.out.println("x["+i+"] : ");
			x[i]=stdIn.nextInt();
		}
		reverse(x);
		
		System.out.println("역순으로 정렬");
		for(int i=0;i<num;i++)
			System.out.println("x["+i+"] : "+x[i]);
	}
	
	// 배열 요소를 교환
	static void swap(int[]a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	//역순으로 정렬
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2;i++) {
			swap(a, i, a.length-i-1);
		}
	}

}
