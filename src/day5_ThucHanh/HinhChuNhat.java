package day5_ThucHanh;

public class HinhChuNhat extends HinhHoc{
	public int chieuDai, chieuRong;
	
	@Override
	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}
}
