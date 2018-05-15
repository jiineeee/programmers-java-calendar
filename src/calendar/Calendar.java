package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] WEEK_DAYS = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public void printCalendar(int year, int month, String day) {
		System.out.printf("<<%d년 %d월>>\n",year,month);
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("--------------------");
		int maxDay = getMaxDaysOfMonth(month);
		if((year%4==0 && year%100!=0)||year%400==0) maxDay = 29;
		int dayNum = 0;
		for(int i=0;i<WEEK_DAYS.length;i++) {
			if(WEEK_DAYS[i].equals(day)) {
				dayNum = i;
			}
		}
		for(int j=0;j<dayNum;j++) {
			System.out.print("   ");
		}
		for(int i=1;i<=maxDay;i++) {
			if(i<10) {
				System.out.print(i + "  ");
			}else {
				System.out.print(i + " ");
			}
			if((i+dayNum)%7==0) {
				System.out.println();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// 숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar c = new Calendar();
		System.out.print("년도를 입력하세요.\nYEAR> ");
		int year = scanner.nextInt();
		System.out.print("달을 입력하세요.\nMONTH> ");
		int month = scanner.nextInt();
		System.out.println("첫번째 요일을 입력하세요.(SU, MO, TU, WE, TH, FR, SA)");
		System.out.print("WEEKDAY> ");
		String day = scanner.next();
		c.printCalendar(year, month, day);
	}
}
