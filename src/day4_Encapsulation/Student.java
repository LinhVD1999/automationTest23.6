package day4_Encapsulation;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student1 = new Person();
		student1.name = "Nguyen Van A";
		student1.setPhoneNumber("0987452120");
		System.out.println("Họ tên: "+student1.name + ", số điện thoại: "+student1.getPhoneNumber());
	}

}
