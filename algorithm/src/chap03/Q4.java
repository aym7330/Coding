package chap03;

import java.util.Scanner;

public class Q4 {

	static int binSearchEx(int[] a, int n, int key) {
		System.out.print("  |");
		for(int i=0;i<n;i++)
			System.out.printf("%2d",i);
		System.out.print("\n--+");
		for(int i=0;i<n;i++)
			System.out.print("--");
		System.out.println();
		int pl=0;
		int pr=n-1;
		do {
			int pc=(pl+pr)/2;
			System.out.print("  |");
			for (int i = 0; i < n; i++) {
				if (i == pl)
					System.out.printf("%2s", "<=");
				else if (i == pr)
					System.out.printf("%2s", "=>");
				else if (i == pc)
					System.out.printf("%2s", "+");
				else
					System.out.print("  ");
			}
			System.out.printf("\n%2d|",pc);
			for (int i = 0; i < n; i++) 
				System.out.printf("%2d",a[i]);
			System.out.println();
			
			if(a[pc]==key)
				return pc;
			else if(a[pc]<key)
				pl=pc+1;
			else pr=pc-1;
		}while(pl<=pr);
		
		return -1;
	}
/*	static int binSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		int pl = 0; // 검색범위 맨 앞의 index
		int pr = n - 1; // 검색범위 맨 뒤의 index

		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			System.out.print("   |");
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", pc);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[pc] == key)
				return pc; // 검색성공
			else if (a[pc] < key)
				pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힘
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
		
		int idx=binSearchEx(x, num, ky);
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}
}
