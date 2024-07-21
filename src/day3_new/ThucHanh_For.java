package day3_new;

import java.util.Scanner;

public class ThucHanh_For {

	public static void inCacSoChanNhoHon11()
	{
		for(int i=1; i <= 10; i++)
		{
			if(i%2==0)
			System.out.println("Gia tri cua i la: "+i);
		}
	}
	
	public static void nhapMang(int doDaiMang)
	{
		Scanner scanner = new Scanner(System.in);
		int []mangSoNguyen = new int[doDaiMang];
		for (int i=0; i< doDaiMang; i++)
		{
			System.out.println("Nhap gia tri cua mang o vi tri thu: "+ i);
			mangSoNguyen[i] = scanner.nextInt();
		}
		inMang(mangSoNguyen);
		timGiaTriLonNhat(mangSoNguyen);
	
	}
	
	public static void inMang(int []mangSoNguyen) {
		System.out.println("Do dai length cua mang: "+ mangSoNguyen.length);
		System.out.print("Cac gia tri cua mang vua nhap la: ");
		for (int i=0; i< mangSoNguyen.length; i++)
		{
			System.out.print(mangSoNguyen[i]+" ");
		}
	}
	
	public static void timGiaTriLonNhat(int []mangSoNguyen) {
		int soLonNhat=0;
		for(int i=0; i< mangSoNguyen.length; i++)
		{
			if(soLonNhat<mangSoNguyen[i]) 
				soLonNhat = mangSoNguyen[i];
		}
		System.out.println("Gia tri lon nhat cua mang la: "+ soLonNhat);
	} 
	
	/*public static void sapXepMangTangDan(int[] mangSoNguyen) {
		int tmp = 0;
		for(int i=0; i< mangSoNguyen.length; i++)
			for(int j=0; j< mangSoNguyen.length-1; j++)
			{
				System.out.println("Lan lap thu"+j+ "de so sanh "+ mangSoNguyen[j]+ "va "+mangSoNguyen[j])
				if(mangSoNguyen[j] > mangSoNguyen[j+1])
				{
					tmp = mangSoNguyen[j];
					mangSoNguyen[j] = mangSoNguyen[j + 1];
					mangSoNguyen[j + 1] = tmp;
							}
			}
	}
	*/
	public static void inCacSoChiaHetCho5NhoHonBang100()
	{
		for(int i=0; i<=100; i++)
		{
			if(i%5==0)
				System.out.println("Cac so chia het cho 5 la:" +i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inCacSoChanNhoHon11();
		//inCacSoChiaHetCho5NhoHonBang100();
		nhapMang(5);
	}

}
