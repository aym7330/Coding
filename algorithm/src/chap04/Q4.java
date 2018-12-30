/**
 * ��¥ : 2018-12-30
 * 
 * ������ : p146
 * 
 * ť : �����͸� �Ͻ������� �׾� �α� ���� �ڷᱸ��, ���� ���� ���� �����͸� ���� ���� ������ ���Լ��� ����
 * ��ť : ť�� �����͸� �ִ� �۾�
 * ��ť : �����͸� ������ �۾�
 * ����Ʈ : �����͸� ������ ��
 * ���� : �����͸� �ִ� ��
 */
package chap04;

public class Q4 {
	private int max;	// ť �뷮
	private int num;	// ���� ������ ��
	private int[] que;	// ť ��ü
	
	// ���� �� ���� : ť�� ��� ����
	public class EmptyAryQueueException extends RuntimeException{
		public EmptyAryQueueException() {}
	}
	
	// ���� �� ���� : ť�� ���� ��
	public class OverflowAryQueueException extends RuntimeException{
		public OverflowAryQueueException() {}
	}
	
	// ������ : ť ��ü�� �迭�� �����ϴ� �� �غ��۾��� ����
	public Q4(int capacity) {
		num=0;
		max=capacity;
		try {
			que=new int[max];
		}catch (OutOfMemoryError e) { // ������ �� ����
			max=0;
		}
	}
	
	// ť�� �����͸� ��ť
	public int enquue(int x) throws OverflowAryQueueException{
		if(num>=max)
			throw new OverflowAryQueueException();	// ť�� ���� ��
		que[num++]=x;
		return x;
	}
	// ť���� �����͸� ��ť
	public int deque() throws EmptyAryQueueException{
		if(num <= 0) 
			throw new EmptyAryQueueException();	// ť�� ��� ����
		int x=que[0];
		for(int i=0;i<num-1;i++)
			que[i]=que[i+1];
		num--;
		return x;
	}
	// ť���� �����͸� ��ũ(�Ӹ� �����͸� ���캽)
	public int peek() throws EmptyAryQueueException{
		if(num<=0)
			throw new EmptyAryQueueException();
		return que[num-1];
	}
	// ť���� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for(int i=0;i<num;i++)
			if(que[i]==x)
				return i;
		return -1;
	}
	// ť�� ���
	public void clear() {
		num=0;
	}
	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	// ť�� ���� ������ ���� ��ȯ
	public int size() {
		return num;
	}
	// ť�� ��� �ִ°�?
	public boolean isEmpty() {
		return num<=0;
	}
	// ť�� ���� á�°�?
	public boolean isFull() {
		return num>=max;
	}
	//ť ���� �����͸� �Ӹ� -> ������ ���ʷ� �����
	public void dump() {
		if(num<=0)
			System.out.println("ť�� ������ϴ�.");
		else {
			for(int i=0;i<num;i++)
				System.out.println(que[i]+" ");
		}
	}
	
	
}
