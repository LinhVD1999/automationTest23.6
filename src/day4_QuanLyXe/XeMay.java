package day4_QuanLyXe;

public class XeMay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe xeMay1 = new Xe();
		xeMay1.setLoaiXe("Honda");
		xeMay1.setTenXe("Vision");
		xeMay1.setVanTocMax(120);
		System.out.println(xeMay1.getLoaiXe()+"," +xeMay1.getTenXe()+","+ xeMay1.getVanTocMax());
		
		Xe xeMay2 = new Xe();
		xeMay2.setLoaiXe("Yamaha");
		xeMay2.setTenXe("Jupiter");
		xeMay2.setVanTocMax(120);
		System.out.println(xeMay2.getLoaiXe()+"," +xeMay2.getTenXe()+","+ xeMay2.getVanTocMax());
	}

}
