/**
 * ��¥ : 2018-12-24
 * 
 * ������ : p121
 * 
 * 1. �ν��Ͻ� �޼���(������ �޼���) => static X
 * �ν��Ͻ� �޼��� ȣ�� �� : Ŭ������ ���� �̸�.�޼��� �̸� a.getId()
 * 2. Ŭ���� �޼���(���� �޼���) => static O
 * Ŭ���� �޼��� ȣ�� �� : Ŭ���� �̸�.�޼��� �̸� Id.getCounter()
 *  
 */
package chap03;

class Id {
	private static int counter = 0; // ���̵� �� �� �ο��ߴ��� ����
	private int id; // ���̵�

	// ������
	public Id() {
		id = ++counter;
	}

	// ���̵� ��ȯ�ϴ� �ν��Ͻ� �޼���
	public int getId() {
		return id;
	}

	// counter�� ��ȯ�ϴ� �޼���
	public static int getCounter() {
		return counter;
	}
}

public class Test3C_1 {
	public static void main(String[] args) {
		Id a=new Id();
		Id b=new Id();
		
		System.out.println("a�� ���̵� : "+a.getId());
		System.out.println("b�� ���̵� : "+b.getId());
		
		System.out.println("�ο��� ���̵��� ���� : "+Id.getCounter());
	}
}

