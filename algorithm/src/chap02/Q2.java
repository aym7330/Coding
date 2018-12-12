/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p61
 */

package chap02;

import java.util.Scanner;

public class Q2 {

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
			for(int j=0; j<a.length;j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
			System.out.println("a["+i+"]과(와) a["+(a.length-i-1)+"]를 교환");
			swap(a, i, a.length-i-1);

		}
		for(int j=0; j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println("\n역순 정렬 종료");
	}

/*	// 배열 a의 요소 값을 나타냄
		static void print(int[] a) {
			for (int i = 0; i < a.length; i++)
				System.out.print(a[i] + " ");
			System.out.println();
		}

		// 배열 a의 요소를 역순으로 정렬
		static void reverse(int[] a) {
			print(a);
			for (int i = 0; i < a.length / 2; i++) {
				System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]를 교환합니다.");
				swap(a, i, a.length - i - 1);
				print(a);
			}*/
}
