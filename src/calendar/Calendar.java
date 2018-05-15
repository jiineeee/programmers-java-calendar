package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
		// 숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar c = new Calendar();
		int month = 0;
		while(true) {
			System.out.println("월을 입력하세요.");
			month = scanner.nextInt();
			if(month==-1) break;
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for(int i=1;i<=c.getMaxDaysOfMonth(month);i++) {
				System.out.print(i + "\t");
				if(i%7==0) {
					System.out.println();
				}
			}
			System.out.println();
		}
		System.out.println("Bye~");
	}
}
