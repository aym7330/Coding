/**
 * 날짜 : 2018-12-23
 * 
 * 페이지 : p117
 */
package chap03;

import java.util.Scanner;

public class Q5 {
	static int binSearchX(int[] a, int n, int key) {
		int pl=0;
		int pr=n-1;
		do {
			int pc=(pl+pr)/2;
			if(a[pc]==key) {
				for(int i=0;i<pc;i++) {
					if(a[i]==key)
						return i;
				}
			}
			else if(a[pc]>key)
				pr=pc-1;
			else 
				pl=pc+1;
				
		}while(pl<=pr);
		return -1;
	}
/*	static int binSearchX(int[] a, int n, int key) {
		int pl = 0; // 검색범위 맨 앞의 index
		int pr = n - 1; // 검색범위 맨 뒤의 index

		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			if (a[pc] == key) {
				for (; pc > pl; pc--) // key와 같은 맨 앞의 요소를 찾습니다
					if (a[pc - 1] < key)
						break;
				return pc; // 검색성공
			} else if (a[pc] < key)
				pl = pc + 1; // 검색범위를 앞쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 뒤쪽 절반으로 좁힘
		} while (pl <= pr);

		return -1; // 검색실패
	}*/
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.println("x[0] :");
		x[0]=stdIn.nextInt();
		
		for(int i=1; i<num;i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);	// 바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.println("검색할 값 : ");
		int ky=stdIn.nextInt();
		
		int idx=binSearchX(x, num, ky);
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}
	
}
