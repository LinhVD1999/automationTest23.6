package day5_ThucHanh;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hcn1 = new HinhChuNhat();
		hcn1.chieuDai = 6;
		hcn1.chieuRong = 4;
		hcn1.setTenHinh("Hình chữ nhật 6 x 4 có diện tích");
		System.out.println(hcn1.getTenHinh()+" " +hcn1.tinhDienTich());
		
		HinhTron ht1 = new HinhTron();
		ht1.banKinh = 5;
		ht1.setTenHinh("Hình tròn bán kính 5 có diện tích");
		System.out.println(ht1.getTenHinh()+" " + ht1.tinhDienTich());
	}

}
