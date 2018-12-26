package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액 : ");
		int price = sc.nextInt();
		int[] arr = new int[10];

		while (price >= 50000) {
			price -= 50000;
			MONEYS[0] = 50000;
			arr[0]++;
		}
		while (price >= 10000) {
			price -= 10000;
			MONEYS[1] = 10000;
			arr[1]++;
		}
		while (price >= 5000) {
			price -= 5000;
			MONEYS[2] = 5000;
			arr[2]++;
		}
		while (price >= 1000) {
			price -= 1000;
			MONEYS[3] = 1000;
			arr[3]++;
		}
		while (price >= 500) {
			price -= 500;
			MONEYS[4] = 500;
			arr[4]++;
		}
		while (price >= 100) {
			price -= 100;
			MONEYS[5] = 100;
			arr[5]++;
		}
		while (price >= 50) {
			price -= 50;
			MONEYS[6] = 50;
			arr[6]++;
		}
		while (price >= 10) {
			price -= 10;
			MONEYS[7] = 10;
			arr[7]++;
		}
		while (price >= 5) {
			price -= 5;
			MONEYS[8] = 5;
			arr[8]++;
		}
		while (price >= 1) {
			price -= 1;
			MONEYS[9] = 1;
			arr[9]++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(MONEYS[i] + "원 : " + arr[i] + "개");
		}

	}

}
