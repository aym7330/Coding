/**
 * ��¥ : 2018-12-11
 * 
 * ������ : p22
 */
package chap01;

import java.util.Scanner;

public class Test1_3 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int n=stdIn.nextInt();
		
		if(n>0)
			System.out.println("���");
		else if(n<0)
			System.out.println("����");
		else 
			System.out.println("0");
	}

}
