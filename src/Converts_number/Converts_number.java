package Converts_number;
/*
1. Write a method that converts a total number of seconds to hours, minutes, and seconds.
Acceptance Criteria:
 (1) Method should have an int parameter (nr. of seconds)
 (2) should calculate the result
 For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".
 */
import java.util.Scanner;

public class Converts_number {
	static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		int number_of_seconds = getNumberOfSeconds();
		Validation(number_of_seconds);
	}

	public static int getNumberOfSeconds (){
		System.out.println("Entere a number of seconds");
		int my_number_of_seconds  = scanner.nextInt();
		return my_number_of_seconds;
	}

	public static void Validation(int number_of_seconds){

		int minutes = 0;
		int hours  = 0;
		int minutes_rest = 0;
		minutes = number_of_seconds / 60;
		int seconds_rest =number_of_seconds % 60;

		if (minutes > 59){
			hours  = minutes / 60;
			minutes_rest = minutes % 60;

		}
		else {
			System.out.println(number_of_seconds + " seconds = " + hours + " hours, " + minutes + " minutes, " + seconds_rest + " seconds");
			System.exit(0);
		}
		System.out.println(number_of_seconds + " seconds = " + hours + " hours, " + minutes_rest + " minutes, " + seconds_rest + " seconds" );
	}
}