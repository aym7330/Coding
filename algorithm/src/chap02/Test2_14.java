/**
 * 날짜 : 2018-12-14
 * 
 * 페이지 : p91
 * 
 * 클래스 : 여러 형의 요소를 조합하여 만든 자료구조
 * 	선언 :	멤버(필드/메서드/중첩 클래스/중첩 인터페이스)
 * 			클래스 초기화 / 인스턴스 초기화
 * 			생성자
 * 필드/메서드/생성자 선언 : public/protected/private을 지정
 * 메서드/생성자는 다중으로 정의(오버로딩)할 수 있다.
 * final : 한번만 값을 대입할 수 있고 변하지 않는다.
 * 생성자 : 새로 생성한 인스턴스의 초기화를 위해 사용
 * 오버로딩 : 메서드나 생성자를 정위할 때 형식은 다르지만 같은 이름을 붙이는 것
 */

package chap02;

import java.util.Scanner;

public class Test2_14 {
	static final int VMAX=21;	//시력 분포 (0.0에서 0.1단위로 21개)
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		//생성자
		public PhyscData(String name, int height, double vision) {
			this.name=name;
			this.height=height;
			this.vision=vision;
		}
	}
	
	static double aveHeight(PhyscData[] dat) {
		double sum=0;
		
		for(int i=0;i<dat.length;i++)
			sum+=dat[i].height;
		
		return sum/dat.length;
	}
	static void distVision(PhyscData[] dat, int[] dist) {
		int i=0;
		dist[i]=0;
		for(i=0;i<dat.length;i++)
			if(dat[i].vision>=0.0 && dat[i].vision <=VMAX/10.0)
				dist[(int)(dat[i].vision*10)]++;
	}
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8),
			};
		int[] vdist=new int[VMAX];
		
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println(" 이름         키       시력");
		System.out.println("---------------");
		for(int i=0;i<x.length;i++)
			System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
		System.out.printf("\n평균 키 : %5.1fcm\n",aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("\n시력 분포");
		for(int i=0;i<VMAX;i++)
			System.out.printf("%3.1f~:%2d명\n",i/10.0,vdist[i]);
	}

}
