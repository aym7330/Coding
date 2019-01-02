/**
 * 날짜 : 2018-12-30
 * 
 * 페이지 : p148
 * 
 * 배열 요소를 앞쪽으로 옮기지 않는 큐를 구현 => 링 버퍼
 * 
 * 배열의 처음이  끝과 연결되었다고 보는 자료구조 => 프런트와 리어 (첫 번째와 마지막 요소 구분)
 * 
 * 프런트와 러어 값을 업데이트하며 인큐와 디큐를 수행
 * 처리복잡도 O(1)
 */

package chap04;

public class Test4_3 {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	// 실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	// 생성자
	public Test4_3(int capacity) {
		num=front=rear=0;
		max=capacity;
		try {
			que=new int[max];
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException{
		if(num >= max)
			throw new OverflowIntQueueException();	//큐가 가득 참
		que[rear++]=x;
		num++;
		if(rear==max)
			rear=0;
		return x;
	}
	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		int x=que[front++];
		num--;
		if(front==max)
			front=0;
		return x;
	}
	// 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int idx=(i+front)%max;
			if(que[idx]==x)
				return idx;
		}
		return -1;
	}
	// 큐를 비움 
	public void clear() {
		num=front=rear=0;
	}
	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}
	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}
	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num<=num;
	}
	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num>=max;
	}
	// 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
	public void dump() {
		if(num<=0)
			System.out.println("큐가 비어 있습니다.");
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
/*	// 큐에서 x를 검색하여 머리부터 몇 번 째인가(찾지 못하면 0)를 반환
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x) // 검색성공
				return i + 1;
		return 0; // 검색실패
	}*/
}
