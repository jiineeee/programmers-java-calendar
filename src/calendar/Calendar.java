package calendar;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("---------------------------------------------------");
		for (int i = 1; i <= 28; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}
}
