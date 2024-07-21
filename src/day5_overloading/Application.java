package day5_overloading;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhTong test = new TinhTong();
		System.out.println(test.add(2, 678));
		System.out.println(test.add(4.15, 678.76));
		System.out.println(test.add("Chuỗi 1", "Chuỗi 2"));
	}

}
