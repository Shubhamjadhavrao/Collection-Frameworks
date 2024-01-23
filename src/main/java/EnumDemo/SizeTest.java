
package EnumDemo;

import java.util.Scanner;

public class SizeTest {

	public static void main(String[] args) {
		
		System.out.println("Please enter a shirt size : ");
		Scanner scanner = new Scanner(System.in);

		String input = scanner.next();

		System.out.println("You entered : " + input);

		Size size = Size.valueOf(input);

		System.out.println("The number for entered size is : " + size.getSize());

		System.out.println(size.calculatePrize());
		
	}

	
}
