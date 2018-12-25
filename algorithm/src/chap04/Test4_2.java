/**
 * 날짜 : 2018-12-25
 * 
 * 페이지 : p142
 */
package chap04;

import java.util.Scanner;

public class Test4_2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Test4_1 s=new Test4_1(64);	//최대 64개를 푸시할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수 : "+s.size()+" / "+s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료 :");
			
			int menu=stdIn.nextInt();
			if(menu==0)break;
			
			int x;
			switch(menu) {
			case 1:	// 푸시
				System.out.print("데이터 : ");
				x=stdIn.nextInt();
				try {
					s.push(x);
				}catch(Test4_1.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2:	// 팝
				try {
					x=s.pop();
					System.out.println("팝한 데이터는 "+x+"입니다.");
				}catch(Test4_1.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 3:	//피크
				try {
					x=s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
				}catch(Test4_1.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 4:	//덤프
				s.dump();
				break;
			}
		}
	}
}
