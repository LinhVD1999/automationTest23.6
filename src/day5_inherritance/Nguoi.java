package day5_inherritance;

public abstract class Nguoi {
	// Thuộc tính private: hoTen, tuoi, ngaySinh -> getter và setter
	// Phương thức diChoi()
	private String hoTen;
	private String ngaySinh;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public void diChoi()
	{
		System.out.println("Trời đẹp thì đi chơi");
	}
	
}
