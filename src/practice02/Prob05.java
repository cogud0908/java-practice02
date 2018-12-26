package practice02;

import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int) (Math.random() * 100) + 1;
		int min = 1, max = 100;
		int num;
		int count = 0;
		String answer;

		do {
			while (true) {
				System.out.println(min + "-" + max);
				System.out.print(++count + ">>");
				num = sc.nextInt();

				if (random > num) {
					System.out.println("더 높게");
					min = num;
				} else if (random < num) {
					System.out.println("더 낮게");
					max = num;
				} else {
					System.out.println("맞았습니다.");
					break;
				}
			}
			System.out.println("다시하시겠습니까? (y,n)>>");
			answer = sc.next();
			
			min = 1; max = 100; count = 0;

		} while (answer.equals("y"));
	}
}
