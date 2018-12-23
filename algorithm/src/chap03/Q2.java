/**
 * 날짜 : 2018-12-19
 * 
 * 페이지 : p115
 */

package chap03;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("요솟 수 : ");
		int num=stdIn.nextInt();
		
		int[] x=new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("x["+i+"] : ");
			x[i]=stdIn.nextInt();
		}
		
		System.out.println("검색할 수 : ");
		int ky=stdIn.nextInt();
		
		System.out.println(ky+"은 x["+seqSearchPrint(x,num,ky)+"]에 있습니다.");
	}
	
	static int seqSearchPrint(int[] x, int n, int key) {
		System.out.print("  |");
		for(int i=0;i<n;i++)
			System.out.printf("%2d",i);
		System.out.println();
		
		System.out.print("--+");
		for(int i=0;i<n;i++) 
			System.out.print("--");
		System.out.println();
		int i;
		for(i=0;i<n;i++) {
			System.out.print("  |");
			for(int j=0;j<i;j++)
				System.out.print("  ");
			System.out.print(" *\n");
			
			System.out.printf("%2d|",i);
			for(int j=0;j<n;j++) 
				System.out.printf("%2d",x[j]);
			System.out.println();
			if (x[i] == key) 
			return i;
		}
		return -1;
	}
	
/*	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // 검색성공
		}
		return -1; // 검색실패
	}*/
}
