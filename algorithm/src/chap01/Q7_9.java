/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p30
 * 
 * 가우스 덧셈
 * 1   +  2+...+99+100
 * 100 + 99+...+2 + 1
 * -------------------
 * 101 + 101+...  + 101
 * 
 * 101*100/2=5050
 * 
 * (n+1)*n/2
 */
package chap01;

import java.util.Scanner;

public class Q7_9 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("n : ");		
		int n =stdIn.nextInt();	
		System.out.println("1-"+n+"까지의 합 : "+sumN(n));
		System.out.println("1-"+n+"까지의 합 : "+sumGauss(n));
		
		System.out.println("a,b사이의 합구하기");
		System.out.println("a : ");		
		int a =stdIn.nextInt();	
		System.out.println("b : ");		
		int b =stdIn.nextInt();	
		System.out.println(a+","+b+"사이의 합 : "+sumOf(a,b));
		
	}
	
	static int sumN(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	static int sumGauss(int n)
	{
		int sum=0;
		sum=(1+n)*n/2;
		return sum;
	}
	static int sumOf(int a, int b)
	{
		int sum=0;
		int min=a;
		int max=b;
		if(b<a)
		{
			min=b;
			max=a;
		}
		for(int i=min;i<=max;i++)
		{
			sum+=i;
		}
		return sum;
	}

}
