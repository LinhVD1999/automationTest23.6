package day2;

public class BTVN_Day2 {
	public static int a,b;
	public static void main(String[] args) {
		a=1123;
		b=6754;
		int result = (a*b/500);
		System.out.println("(a*b)/500=" +result);
		printLargerNumber(a,b);
	}
	public static void printLargerNumber(double st1, double st2)
	{
		if(st1>st2)
			System.out.println("Số lớn hơn là: "+st1);
		else
			System.out.println("Số lớn hơn là: "+st2);
	}
}
