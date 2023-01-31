package LPA;

import java.util.Locale;
import java.util.Scanner;

public class Array_Calculo_Media {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter the amount of heights:");
		
		int totalHeights = input.nextInt();

		double[] arrayHeight = new double[totalHeights];

		for (int i = 0; i < arrayHeight.length; i++) {
			System.out.println("Enter the heights:");
			arrayHeight[i] = input.nextDouble();

		}
		double sum = 0.0;

		for (int i = 0; i < arrayHeight.length; i++) {
			sum += arrayHeight[i];
		}

		double average = sum / totalHeights;
		System.out.println("AVERAGE HEIGHT: " + average);
		input.close();

	}
}
