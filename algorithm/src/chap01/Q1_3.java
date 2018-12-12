/**
 * 날짜 : 2018-12-11
 * 
 * 페이지 : p19
 */

package chap01;
import java.util.Scanner;

public class Q1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		System.out.println("a : ");int a=stdIn.nextInt();
		System.out.println("b : ");int b=stdIn.nextInt();
		System.out.println("c : ");int c=stdIn.nextInt();
		System.out.println("d : ");int d=stdIn.nextInt();
		System.out.println("max4("+a+","+b+","+c+","+d+") = "+max4(a,b,c,d));
		System.out.println("min3("+a+","+b+","+c+") = "+min3(a,b,c));
		System.out.println("min4("+a+","+b+","+c+","+d+") = "+min4(a,b,c,d));
	}
	
	static int max4(int a, int b, int c, int d)
	{
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		return max;
	}
	static int min3(int a, int b, int c)
	{
		int min = a;
		if(b<min) min=b;
		if(c<min) min=c;
		return min;
	}
	static int min4(int a, int b, int c, int d)
	{
		int min = a;
		if(b<min) min=b;
		if(c<min) min=c;
		if(d<min) min=d;
		return min;
	}
	
}
