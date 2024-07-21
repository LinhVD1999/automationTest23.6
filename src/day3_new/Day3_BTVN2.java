package day3_new;

import java.util.Scanner;

public class Day3_BTVN2 {

	
	public static void nhapMang(int doDaiMang) {
		Scanner scanner = new Scanner(System.in);
		int[] mangSoNguyen = new int[doDaiMang];
		for (int i = 0; i < doDaiMang; i++) {
			System.out.println("Nhập giá trị của mảng ở vị trí thứ: " + i);
			mangSoNguyen[i] = scanner.nextInt();
			if(mangSoNguyen[i] %2 ==0 && mangSoNguyen[i] %3 ==0) {
				System.out.println("Điều kiện thoát xảy ra");
				return;
			}

		}
	}
	public static void main(String[] args) {
		nhapMang(3);

	}

}