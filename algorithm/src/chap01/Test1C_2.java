/**
 * ��¥ : 2018-12-11
 * 
 * ������ : p34
 * 
 * ������ ���α׷��� : �ϳ��� �Ա��� �ϳ��� �ⱸ�� ������ ���� ��Ҹ��� ���������� ��ġ�Ͽ� ���α׷��� �����ϴ� ���
 * 				����, ����, �ݺ��̶�� 3������ ���� �帧 ���
 * 
 * ��𸣰� ��Ģ : �� ������ �����ϰ� ������ ��������, ������ �������� �ٲٰ� �ٽ� ��ü�� �����ϸ� ������ ���ǰ� ����.
 * 				!(no>=10 ||no<=99)
 */

package chap01;

import java.util.Scanner;

public class Test1C_2 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���. ");
		
		do {
			System.out.println("�Է� : ");
			no=stdIn.nextInt();
		}while(no<10 ||no>99);
		
		System.out.println("���� no�� ���� "+no+"��(��) �Ǿ����ϴ�.");

	}

}
