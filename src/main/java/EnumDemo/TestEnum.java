package EnumDemo;

import java.util.Scanner;

public class TestEnum {
	public static Days days;

	public static void main(String[] args) {
		String res = DaysFeelLike(Days.MONDAY);
		System.out.println(res);
		System.out.println(Days.FRIDAY.name());
		System.out.println(Days.MONDAY.ordinal());
		System.out.println(Days.MONDAY);
		String s = Days.MONDAY.toString();

		System.out.println("Enter the Day:");

		Scanner scanner = new Scanner(System.in);

		String input = scanner.next();

		System.out.println("Entered: " + input);
//		System.out.println(DaysFeelLike(Days.valueOf(input)));
//		Days d = Days.valueOf("MONDAY");
	}

	public static String DaysFeelLike(Days day) {
		String result = "";

		switch (day) {
		case MONDAY:
			result = "Boring....";
			break;
			
		case THURSDAY:
			result="Goood Last Week!!!";
			break;
		case SATURDAY :case SUNDAY 	:
			result="Weekend is Best";
			break;


		default:
			System.out.println();
			result="MidWeek is  so on";
			break;
		}
		return result;
	}

}
