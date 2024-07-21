package day5_inherritance;

public class SinhVien extends Nguoi {
	// Thuộc tính mở rộng: maSV, soTinChi
	// Ghi đè lên diChoi()
	// Mở rộng: diHoc(

	private String maSV;
	private String SoTinChi;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getSoTinChi() {
		return SoTinChi;
	}
	public void setSoTinChi(String soTinChi) {
		SoTinChi = soTinChi;
	}
	
	@Override
	public void diChoi() {
		System.out.println("Học hết bài rồi đi chơi");	
	}
	
	public void diHoc() {
		System.out.println("Sinh viên đi học 5 ngày/tuần");	
	}
		
	
}
