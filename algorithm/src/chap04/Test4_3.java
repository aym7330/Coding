/**
 * ��¥ : 2018-12-30
 * 
 * ������ : p148
 * 
 * �迭 ��Ҹ� �������� �ű��� �ʴ� ť�� ���� => �� ����
 * 
 * �迭�� ó����  ���� ����Ǿ��ٰ� ���� �ڷᱸ�� => ����Ʈ�� ���� (ù ��°�� ������ ��� ����)
 * 
 * ����Ʈ�� ���� ���� ������Ʈ�ϸ� ��ť�� ��ť�� ����
 * ó�����⵵ O(1)
 */

package chap04;

public class Test4_3 {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	// ���� �� ���� : ť�� ��� ����
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	// ���� �� ���� : ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	// ������
	public Test4_3(int capacity) {
		num=front=rear=0;
		max=capacity;
		try {
			que=new int[max];
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
	// ť�� �����͸� ��ť
	public int enque(int x) throws OverflowIntQueueException{
		if(num >= max)
			throw new OverflowIntQueueException();	//ť�� ���� ��
		que[rear++]=x;
		num++;
		if(rear==max)
			rear=0;
		return x;
	}
	// ť���� �����͸� ��ť
	public int deque() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		int x=que[front++];
		num--;
		if(front==max)
			front=0;
		return x;
	}
	// ť���� �����͸� ��ũ(����Ʈ �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	// ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int idx=(i+front)%max;
			if(que[idx]==x)
				return idx;
		}
		return -1;
	}
	// ť�� ��� 
	public void clear() {
		num=front=rear=0;
	}
	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	// ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}
	// ť�� ��� �ֳ���?
	public boolean isEmpty() {
		return num<=num;
	}
	// ť�� ���� á����?
	public boolean isFull() {
		return num>=max;
	}
	// ť ���� ��� �����͸� ����Ʈ -> ���� ������ ���
	public void dump() {
		if(num<=0)
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for(int i=0;i<num;i++)
				System.out.print(que[(i+front)%max]+" ");
			System.out.println();
		}
	}
	
	// Q5
	int search(int x) {
		int idx=0;
		int i=front;
		int n=0;
		while(n<max){
			++idx;
			if(que[i]==x)
				return idx;
			if(i>max)i=0;
			else
				i++;
			n++;
		}
	
		return 0;
	}
/*	// ť���� x�� �˻��Ͽ� �Ӹ����� �� �� °�ΰ�(ã�� ���ϸ� 0)�� ��ȯ
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x) // �˻�����
				return i + 1;
		return 0; // �˻�����
	}*/
}
