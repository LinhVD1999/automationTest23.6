package day4_Encapsulation;

public class Person {
	public String name;
	private String phoneNumber;

	// Vì phoneNumber là biến private nên cần tạo Get để lấy thông tin
	// và set để nhập thông tin số điện thoại
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	

}
