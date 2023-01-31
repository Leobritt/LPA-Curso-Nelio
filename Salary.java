package LPA;

import java.util.*;

public class Ex004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		double hours;
		double valueHours;
		double result;

		System.out.println("Informe o número do funcionário e número de horas trabalhadas e o valor da hora:");
		number = input.nextInt();
		hours = input.nextDouble();
		valueHours = input.nextDouble();

		result = hours * valueHours;

		System.out.println("Number: " + number);
		System.out.printf("Salary = %.2f", result);

		input.close();
	}

}
