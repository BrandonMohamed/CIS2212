//Brandon Mohamed
//CIS 2212
//6-14-21

public class MemoryCalc {

	public static void main(String[] args) {

		MemoryCalculator calc = new MemoryCalculator(); // create class

		double operand2;

		while (true) {

			System.out.println("\nThe current value is " + calc.getCurrentValue() + "\n");

			switch (MemoryCalculator.displayMenu()) {
			case 1: // ADD
				operand2 = MemoryCalculator.getOperand("What is the second number? ");
				calc.add(operand2);
				break;
			case 2: // SUBTRACT
				operand2 = MemoryCalculator.getOperand("What is the second number? ");
				calc.subtract(operand2);
				break;
			case 3: // MULTIPLY
				operand2 = MemoryCalculator.getOperand("What is the second number? ");
				calc.multiply(operand2);
				break;
			case 4: // DIVIDE
				operand2 = MemoryCalculator.getOperand("What is the second number? ");
				calc.divide(operand2);
				break;
			case 5: // CLEAR
				calc.clear();
				break;
			case 6: // EXIT
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}
	}
}
