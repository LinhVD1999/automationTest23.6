package day4;

public class Motobike_Object {

	static String hangXe;
	static String mauXe;
	static String bienSoXe;
	static String ngayDangKy;
	
	public static String getInformation()
	{
		return ("Hãng xe là: "+ hangXe +", màu xe: "+mauXe+ ", biển số xe: "+bienSoXe+ ", ngày đăng ký: "+ngayDangKy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motobike_Object xe1 = new Motobike_Object();
		xe1.hangXe = "Lead";
		xe1.mauXe = "Đen";
		xe1.bienSoXe = "29H1-42176";
		xe1.ngayDangKy = "01/01/2024";
		System.out.println(xe1.getInformation());
		
		Motobike_Object xe2 = new Motobike_Object();
		xe2.hangXe = "Vision";
		xe2.mauXe = "Trắng";
		xe2.bienSoXe = "30H1-51387";
		xe2.ngayDangKy = "01/02/2024";
		System.out.println(xe2.getInformation());
	}

}
