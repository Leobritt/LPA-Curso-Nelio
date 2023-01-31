package Demonstration;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_Demo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o tamanho da matriz: ");
		int n = input.nextInt();

		int[][] arrayBi = new int[n][n];

		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				arrayBi[i][j] = input.nextInt();
			}
		}
		// print a matriz toda
		System.out.println("Matriz inteira");
		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				System.out.print(arrayBi[i][j] + " ");

			}
			System.out.println();
		}
		// print principal diagonal
		System.out.println("Diagonal Principal");

		for (int i = 0; i < n; i++) {
			System.out.print(arrayBi[i][i] + " ");
		}
		System.out.println();
		
		int qt = 0;
		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				if (arrayBi[i][j] < 0) {
					qt++;
				}
			}
		}
		System.out.println("Total Negativo: "+qt);
		
		input.close();
	}
}
