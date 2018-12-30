/**
 * 날짜 : 2018-12-30
 * 
 * 페이지 : p146
 * 
 * 큐 : 데이터를 일시적으로 쌓아 두기 위한 자료구조, 가장 먼저 넣은 데이터를 가장 먼저 꺼내는 선입선출 구조
 * 인큐 : 큐에 데이터를 넣는 작업
 * 디큐 : 데이터를 꺼내는 작업
 * 프런트 : 데이터를 꺼내는 쪽
 * 리어 : 데이터를 넣는 쪽
 */
package chap04;

public class Q4 {
	private int max;	// 큐 용량
	private int num;	// 현재 데이터 수
	private int[] que;	// 큐 본체
	
	// 실행 시 예외 : 큐가 비어 있음
	public class EmptyAryQueueException extends RuntimeException{
		public EmptyAryQueueException() {}
	}
	
	// 실행 시 예외 : 큐가 가득 참
	public class OverflowAryQueueException extends RuntimeException{
		public OverflowAryQueueException() {}
	}
	
	// 생성자 : 큐 본체용 배열을 생성하는 등 준비작업을 수행
	public Q4(int capacity) {
		num=0;
		max=capacity;
		try {
			que=new int[max];
		}catch (OutOfMemoryError e) { // 생성할 수 없음
			max=0;
		}
	}
	
	// 큐에 데이터를 인큐
	public int enquue(int x) throws OverflowAryQueueException{
		if(num>=max)
			throw new OverflowAryQueueException();	// 큐가 가득 참
		que[num++]=x;
		return x;
	}
	// 큐에서 데이터를 디큐
	public int deque() throws EmptyAryQueueException{
		if(num <= 0) 
			throw new EmptyAryQueueException();	// 큐가 비어 있음
		int x=que[0];
		for(int i=0;i<num-1;i++)
			que[i]=que[i+1];
		num--;
		return x;
	}
	// 큐에서 데이터를 피크(머리 데이터를 살펴봄)
	public int peek() throws EmptyAryQueueException{
		if(num<=0)
			throw new EmptyAryQueueException();
		return que[num-1];
	}
	// 큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for(int i=0;i<num;i++)
			if(que[i]==x)
				return i;
		return -1;
	}
	// 큐를 비움
	public void clear() {
		num=0;
	}
	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}
	// 큐에 쌓인 데이터 수를 반환
	public int size() {
		return num;
	}
	// 큐가 비어 있는가?
	public boolean isEmpty() {
		return num<=0;
	}
	// 큐가 가득 찼는가?
	public boolean isFull() {
		return num>=max;
	}
	//큐 안의 데이터를 머리 -> 꼬리의 차례로 출력함
	public void dump() {
		if(num<=0)
			System.out.println("큐가 비었습니다.");
		else {
			for(int i=0;i<num;i++)
				System.out.println(que[i]+" ");
		}
	}
	
	
}
