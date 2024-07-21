package day5_inherritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1 = new SinhVien();
		sv1.setHoTen("Vũ Diệu Linh");
		sv1.setMaSV("SV01");
		sv1.setNgaySinh("14/06/1999");
		sv1.setSoTinChi("25");
		System.out.println("Sinh viên: " +sv1.getHoTen()+" " +sv1.getMaSV()+" "+ sv1.getNgaySinh()+" "+ sv1.getSoTinChi());
		sv1.diChoi();
		sv1.diHoc();
		System.out.println("===============");
		
		GiaoVien gv1 = new GiaoVien();
		gv1.setHoTen("Nguyễn Văn A");
		gv1.setMaGV("GV02");
		gv1.setNgaySinh("20/01/1999");
		gv1.setSoNamKN("2");
		System.out.println("Giáo viên: "+gv1.getHoTen()+" " +gv1.getMaGV()+" "+gv1.getNgaySinh()+" "+gv1.getSoNamKN());
		gv1.diChoi();
		gv1.diDay();
	}

}
