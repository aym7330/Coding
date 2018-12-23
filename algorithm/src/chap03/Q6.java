/**
 * 날짜 : 2018-12-23
 * 
 * 페이지 : p121
 */

package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.println("x[0] : ");
		x[0]=stdIn.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int ky=stdIn.nextInt();
		
		int idx=Arrays.binarySearch(x, ky);
		
		if(idx<=-1) {
			idx=idx+1;
			idx=-idx;
			System.out.println("삽입포인트는 +"+idx+"입니다.");
		}
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
/*		if (idx < 0) {
			int insPoint = -idx - 1;
			System.out.println("그 값의 요소가 없습니다.");
			System.out.printf("삽입 포인트는 %d입니다.\n", insPoint);
			System.out.printf("x[%d]의 바로 앞에 %d를 삽입하면 배열의 정렬 상태가 유지됩니다.", insPoint, ky);
		} else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");*/
	}
}
