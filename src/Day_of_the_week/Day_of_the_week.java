package Day_of_the_week;
/*

3. Write a method that prints day of the week by given number.
		Acceptance Criteria:
		(1) Method should have an int parameter
		(2) Should display a message like: "3rd day of the week is Wednesday"
		Use switch case!
 */

import java.util.Scanner;

public class Day_of_the_week {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int number_of_day =getNumberOfDay();
		Validation(number_of_day);

	}
	public static int getNumberOfDay() {
		System.out.println("Entere a number of day");
		int number = scanner.nextInt();
		return number;
	}

	public static void Validation( int number_of_day){
		switch (number_of_day) {
			case 1:
				System.out.println("1 day of the week is Monday");
				break;
			case 2:
				System.out.println("2 day of the week is Tuesday");
				break;
			case 3:
				System.out.println("3 day of the week is Wednesday");
				break;
			case 4:
				System.out.println("4 day of the week is Thursday");
				break;
			case 5:
				System.out.println(" 5day of the week is Friday");
				break;
			case 6:
				System.out.println("6 day of the week is Saturday");
				break;
			case 7:
				System.out.println("7 day of the week is Sunday");
				break;
			default:
				System.out.println("Error, probably you introduce invalid number of day");
		}

	}
}
