package day5_ThucHanh_overloading;

public class TinhLuong {
	public double tinhLuong (double luongcoban, double hesoluong)
	{
		return luongcoban*hesoluong;
	}
	
	public double tinhLuong(double luongcoban, double hesoluong, double namkinhnghiem)
	{
		return luongcoban*hesoluong*namkinhnghiem;
	}
	public double tinhLuong(double luongcoban, double hesoluong, double namkinhnghiem, double loai)
	{
		return luongcoban*hesoluong*namkinhnghiem*loai;
	}

}
