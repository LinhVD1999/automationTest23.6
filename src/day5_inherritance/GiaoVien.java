package day5_inherritance;

public class GiaoVien extends Nguoi{
	// Thuộc tính mở rộng: maGV, soNan
		// Ghi đè lên diChoi()
		// Mở rộng: diHoc()
	private String maGV;
	private String soNamKN;

	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getSoNamKN() {
		return soNamKN;
	}
	public void setSoNamKN(String soNamKN) {
		this.soNamKN = soNamKN;
	}
	
	@Override
	public void diChoi() {
		System.out.println("Dạy và chấm xong bài + trời đẹp thì đi chơi");	
	}
	
	public void diDay()
	{
		System.out.println("Dạy 15 tiết 1 tuần");	
	}
}
