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

		int pl = 0; // �˻����� �� ���� index
		int pr = n - 1; // �˻����� �� ���� index

		do {
			int pc = (pl + pr) / 2; // �߾ӿ���� index
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
				return pc; // �˻�����
			else if (a[pc] < key)
				pl = pc + 1; // �˻������� ���� �������� ����
			else
				pr = pc - 1; // �˻������� ���� �������� ����
		} while (pl <= pr);
		return -1; // �˻�����
	}*/
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num=stdIn.nextInt();
		int[] x=new int[num];
		
		System.out.println("������������ �Է��ϼ���");
		
		System.out.println("x[0] :");
		x[0]=stdIn.nextInt();
		
		for(int i=1; i<num;i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);	// �ٷ� ���� ��Һ��� ������ �ٽ� �Է�
		}
		
		System.out.println("�˻��� �� : ");
		int ky=stdIn.nextInt();
		
		int idx=binSearchEx(x, num, ky);
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}
}
