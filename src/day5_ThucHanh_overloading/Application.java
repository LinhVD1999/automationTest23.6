package day5_ThucHanh_overloading;

public class Application {
	
	static double luongcoban = 10000000;
	static double loai1 = 0.2;
	static double loai2 = 0.45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhLuong luong = new TinhLuong();
	
		System.out.println("Lương theo hệ số: "+luong.tinhLuong(luongcoban, 1.5));
		System.out.println("Lương theo số năm kinh nghiệm: "+luong.tinhLuong(luongcoban, 1.5, 3));
		System.out.println("Lương theo chuyên khoa: " + luong.tinhLuong(luongcoban, 1.5, 5, loai1));
		System.out.println("Lương theo đa khoa: " + luong.tinhLuong(luongcoban, 1.5, 5, loai2));
		
	}

}
