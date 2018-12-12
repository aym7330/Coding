/**
 * 날짜 : 2018-12-12
 * 
 * 페이지 : p61
 */

package chap02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		System.out.println("배열의 합 : "+sumOf(input()));		

	}
	
	static int[] input() {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("배열의 크기 : ");
		int num=stdIn.nextInt();
		int[] a=new int[num];
		for(int i=0; i<num;i++) {
			System.out.println("배열["+i+"] : ");
			a[i]=stdIn.nextInt();
		}
		return a;
	}
	
	static int sumOf(int[]a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}

}
