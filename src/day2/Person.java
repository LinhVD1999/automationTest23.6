package day2;

public class Person {

	public static int a,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Họ và tên: Vũ Diệu Linh");
		System.out.println("Số điện thoại: 0374200934");
		System.out.println("Email: linhvd.dl@gmail.com");
		a=400;
		b=70;
		int result = (a*b)/500; //đặt breakpoint tại dòng cần debug
		System.out.println("(a*b)/500 = "+result);
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
