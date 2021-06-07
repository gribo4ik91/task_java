package Divisible;
/*
2. Write a method that prints if a number is divisible by 3 or 5.
Acceptance Criteria:
 (1) Method should have an int parameter
 (2) if number is divisible by 3 then print "Is divisible by 3"
 (3) if number is divisible by 5 then print "Is divisible by 5"
 (4) if number is divisible by 3 and 5 then print "Is divisible by 3 and 5"
 (5) if number isn't divisible by 3 and 5 then print "Isn't divisible by 3 and 5"
Use if else statement.
 */

import java.util.Scanner;

public class Divisible {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int number = getNumber();
		int number_rest = getNumber_rest(number);
		int number_rest_by_five = getNumber_rest_by_five(number);
		Validation(number_rest,number_rest_by_five);
	}

	public static int getNumber() {
		System.out.println("Entere a number");
		int mynumber = scanner.nextInt();
		return mynumber;
	}

	public static int getNumber_rest(int number) {
		int my_number_rest = number % 3;
		return my_number_rest;
	}
//test
	public static int getNumber_rest_by_five(int number) {
		int my_number_rest_by_five = number % 5;
		return my_number_rest_by_five;
	}
	public static void Validation(int number_rest, int number_rest_by_five){
		if  (number_rest == 0 && number_rest_by_five == 0){
			System.out.println("Is divisible by 3 and 5");
			System.exit(0);
		}

		if ( number_rest == 0 || number_rest_by_five == 0) {
			if (number_rest == 0){
				System.out.println("Is divisible by 3");
			}
			if(number_rest_by_five == 0){
				System.out.println("Is divisible by 5");
			}
		}
		else {
			System.out.println( "Isn't divisible by 3 and 5");
		}
	}

}
