/**
 * 날짜 : 2018-12-22
 * 
 * 페이지 : p117
 */

package chap03;

import java.util.Scanner;

public class Q3 {
	static int searchIdx(int[] a, int num, int key, int[] idx) {
		int n=0;
		for(int i=0;i<num;i++) {
			if(a[i]==key) {
				idx[n]=i;
				n++;
			}
		}
		return n;
	}
/*	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0; // key와 같은 요솟수
		for (int i = 0; i < n; i++)
			if (a[i] == key)
				idx[count++] = i;
		return count;
	}*/
	
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"] :");
			x[i]=stdIn.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky=stdIn.nextInt();
		
		int[] idx= new int[num];
		int n=searchIdx(x, num, ky, idx);	//배열 x에서 키 값이 ky인 요소를 검색
		System.out.println(n);
		
/*		if (n == 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			for (int i = 0; i < n; i++)
				System.out.println("그 값은 " + "x[" + idx[i] + "]에 있습니다.");*/
		}
}
