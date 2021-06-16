//Brandon Mohamed
//CIS 2212
//Menu-Driven Calculator

import java.util.Scanner;

public class MenuDrivenCalculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int modOne = 0;
		int modTwo = 0;
		boolean modThree = false;

		while (modOne != 1) {
			while (!modThree) {
				System.out.println("Menu\n" + "1. Add\n" + "2. Subtract\n" + "3. Multiply\n" + "4. Divide\n"
						+ "5. Generate Random Number\n" + "6. Quit\n" + "What would you like to do?\n");

				int menuObject = (int) input.nextDouble();

				// declare variables
				double firstNum;
				double secondNum;
				double answer;
				int lowerLimit;
				int upperLimit;

				switch (menuObject) {
				case 1: // ADDITION
					System.out.println("What is the first number? ");
					firstNum = (double) input.nextDouble();

					System.out.println("What is the second number? ");
					secondNum = (double) input.nextDouble();
					answer = firstNum + secondNum;

					System.out.print("Answer: " + answer + "\n\n");
					modOne++;
					modTwo = 0;
					break;

				case 2: // SUBTRACTION
					System.out.println("What is the first number? ");
					firstNum = (double) input.nextDouble();

					System.out.println("What is the second number? ");
					secondNum = (double) input.nextDouble();
					answer = firstNum - secondNum;

					System.out.print("Answer: " + answer + "\n\n");
					modOne++;
					modTwo = 0;
					break;
				case 3: // MULTIPLICATION
					System.out.println("What is the first number? ");
					firstNum = (double) input.nextDouble();

					System.out.println("What is the second number? ");
					secondNum = (double) input.nextDouble();
					answer = firstNum * secondNum;

					System.out.print("Answer: " + answer + "\n\n");
					modOne++;
					modTwo = 0;
					break;
				case 4:
					System.out.println("What is the first number? ");
					firstNum = (double) input.nextDouble();

					System.out.println("What is the second number? ");
					secondNum = (double) input.nextDouble();
					if (secondNum == 0) {
						System.out.println("I'm sorry, you can't divide by zero.");
					} else {
						answer = firstNum / secondNum;
						System.out.print("Answer: " + answer + "\n\n");
					}
					modOne++;
					modTwo = 0;
					break;
				case 5:
					System.out.println("What is the lower limit? ");
					lowerLimit = (int) input.nextDouble();

					System.out.println("What is the upper limit? ");
					upperLimit = (int) input.nextDouble();

					answer = (int) (Math.random() * lowerLimit) + upperLimit;
					System.out.print("Answer: " + answer + "\n\n");
					modOne++;
					modTwo = 0;
					break;
				case 6:
					System.out.println("Goodbye!");
					System.exit(0);
					modThree = true;
					break;
				default:
					System.out.println("I'm sorry, " + menuObject + " wasn't one of the options.");
					modTwo++;
					if (modTwo == 3) {
						System.out.println("Please try again later.");
						System.exit(0);
					}
					break;
				}

			}

		}
	}
}
