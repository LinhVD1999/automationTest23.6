package day3_new;

import java.util.Scanner;

public class Day3_BTVN3 {

	public static void nhapMang(int doDaiMang) {
		Scanner scanner = new Scanner(System.in);
		int[] mangSoNguyen = new int[doDaiMang];
		for (int i = 0; i < doDaiMang; i++) {
			System.out.println("Nhập giá trị của mảng ở vị trí thứ: " + i);
			mangSoNguyen[i] = scanner.nextInt();
			

		}

		timGiaTriNhoNhat(mangSoNguyen);
		
	}
	
	public static void timGiaTriNhoNhat(int[] mangSoNguyen) {
		int soNhoNhat = mangSoNguyen[0];
		for (int i = 0; i < mangSoNguyen.length; i++) {
			if (soNhoNhat > mangSoNguyen[i])
				soNhoNhat = mangSoNguyen[i];
		}
		System.out.println("Giá trị nhỏ nhất của mảng là: " + soNhoNhat);
	}
	public static void main(String[] args) {
		nhapMang(5);

	}

}
