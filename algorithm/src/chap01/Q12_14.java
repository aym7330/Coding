/**
 * ³¯Â¥ : 2018-12-11
 * 
 * ÆäÀÌÁö : p38
 */
package chap01;

import java.util.Scanner;

public class Q12_14 {

	public static void main(String[] args) {
		System.out.println("°ö¼ÀÇ¥"); //Q12
		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				System.out.print("   |");
				for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);			
				}
				System.out.println();
				System.out.println(" --+---------------------------");
			}
			else
			{
				System.out.printf("%3d|",i-1);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%3d", (i-1) * j);			
					}
				System.out.println();
			}

		}
		
		System.out.println("µ¡¼ÀÇ¥"); //Q13
		System.out.print("   |");
		for (int j = 1; j <= 9; j++) {
		System.out.printf("%3d", j);			
		}
		System.out.println();
		System.out.println(" --+---------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d|",i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i+j);			
				}
			System.out.println();
		}
		
		System.out.println("»ç°¢Çü Ãâ·Â");//Q14		
		Scanner stdIn=new Scanner(System.in);
		int n;
		do {
			System.out.println("´Ü ¼ö : ");
			n=stdIn.nextInt();
		}while(n<1);
			
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
