/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p40
 */
package chap01;

import java.util.Scanner;

public class Q15_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.println("n : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		System.out.println("trianleLB");
		trianleLB(n);
		System.out.println("trianleLU");
		trianleLU(n);
		System.out.println("trianleRU");
		trianleRU(n);
		System.out.println("trianleRB");
		trianleRB(n);
		System.out.println("spira");
		spira(n);
		System.out.println("nspira");
		nspira(n);

	}

	static void trianleLB(int n) { // Q15
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	static void trianleLU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--)
				System.out.print("*");
			System.out.println();
		}
	}

	static void trianleRU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = n; j > i; j--)
				System.out.print("*");
			System.out.println();
		}
	}

	static void trianleRB(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	static void spira(int n) { // Q16
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++)
				System.out.print(" ");
			for (int j = 0; j < (2 * i + 1); j++)
				System.out.print("*");
			System.out.println();
		}
	}

	static void nspira(int n) { // Q17
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++)
				System.out.print(" ");
			for (int j = 0; j < (2 * i + 1); j++)
				System.out.print((i + 1) % 10);
			System.out.println();
		}
	}
}
