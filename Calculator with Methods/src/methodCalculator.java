//Brandon Mohamed
//CIS 2212
//Calculator with methods

import java.util.Scanner;

public class methodCalculator {

	public static void main(String[] args) {
		double operand1, operand2, lowerLimit, upperLimit;
		while (true) {
			switch (getMenuOption()) { // checks users choice
			case 1:
				operand1 = getOperand("What is the first number? ");
				operand2 = getOperand("What is the second number? ");
				System.out.println("Answer: " + add(operand1, operand2) + " \n");
				break;
			case 2:
				operand1 = getOperand("What is the first number? ");
				operand2 = getOperand("What is the second number? ");
				System.out.println("Answer: " + subtract(operand1, operand2) + " \n");
				break;
			case 3:
				operand1 = getOperand("What is the first number? ");
				operand2 = getOperand("What is the second number? ");
				System.out.println("Answer: " + multiply(operand1, operand2) + " \n");
				break;
			case 4:
				operand1 = getOperand("What is the first number? ");
				operand2 = getOperand("What is the second number? ");
				System.out.println("Answer: " + divide(operand1, operand2) + " \n");
				break;
			case 5:
				operand1 = getOperand("What is the lower limit? ");
				operand2 = getOperand("What is the upper limit? ");
				System.out.println("Answer: " + random(operand1, operand2) + " \n");
				break;
			case 6:
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}

	}

	public static int getMenuOption() {
		Scanner input = new Scanner(System.in);

		boolean invalid = true;
		int choice = 0;
		while (invalid) {
			System.out.println(
					"Menu\n1. Add\n2. Subtract\n3." + " Multiply\n4. Divide\n5. Generate Random Number\n6. Quit");
			System.out.print("What would you like to do? ");
			choice = input.nextInt();
			invalid = (choice >= 1 && choice <= 6) ? false : true;
			if (invalid) {
				System.out.println("I'm sorry, " + choice + " wasn't one of the options\n");
			}

		}
		return choice;
	}

	public static double getOperand(String prompt) { // method for operand input
		Scanner input = new Scanner(System.in);
		System.out.print(prompt);
		double operand = input.nextDouble();
		return operand;

	}

	// methods for math operations
	public static double add(double operand1, double operand2) {// ADDITION
		return operand1 + operand2;

	}

	public static double subtract(double operand1, double operand2) {// SUBTRACTION
		return operand1 - operand2;

	}

	public static double multiply(double operand1, double operand2) {// MULTIPLICATION
		return operand1 * operand2;

	}

	public static double divide(double operand1, double operand2) { // DIVISION
		return (operand2 == 0) ? (0.0 / 0.0) : (operand1 / operand2);

	}

	public static double random(double lowerLimit, double upperLimit) {
		return lowerLimit + ((double) (Math.random() * (upperLimit - lowerLimit)));

	}

}