package calendar;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("---------------------------------------------------");
		for (int i = 1; i <= 28; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}
}
