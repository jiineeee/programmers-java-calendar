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
		System.out.println("반복 횟수를 입력하세요.");
		int count = scanner.nextInt();

		System.out.println("월을 입력하세요.");
		int[] month = new int[count];
		for (int i = 0; i < count; i++) {
			month[i] = scanner.nextInt();
		}
		for (int i = 0; i < count; i++) {
			System.out.println(month[i] + "월은 " + c.getMaxDaysOfMonth(month[i]) + "일까지 있습니다.");

		}
	}
}
