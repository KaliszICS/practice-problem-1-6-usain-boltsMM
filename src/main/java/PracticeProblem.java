/**
		* File: Lesson 1.6 - Booleans
		* Author: Mansoor muhammad
		* Date Created: February 20, 2026
		* Date Last Modified: February 20, 2026
		*/

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		boolean cool;
		System.out.print("Input a boolean: ");
		cool = input.nextBoolean();

		System.out.println(cool);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		int numlint;
		System.out.print("Input an integer: ");
		numlint = input.nextInt();

		System.out.println(numlint > 5);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		String pizz;
		System.out.print("Input pizza: ");
		pizz = input.nextLine();

		System.out.println(pizz.equals("pizza"));
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		double num;
		System.out.print("Input a number: ");
		num = input.nextDouble();

		System.out.println(num == 0);

	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		int numble;
		System.out.print("Input an integer: ");
		numble = input.nextInt();

		System.out.println(numble != 0);


	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word earlier than google: ");
		word = input.nextLine();

		System.out.println(0 > word.compareTo("google"));

	}

}
