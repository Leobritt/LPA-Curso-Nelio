package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Array_Altura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas?");
		int n = input.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < altura.length; i++) {
			System.out.println("Informe os dados da " + (i + 1) + "º pessoa:");
			System.out.println("\nNome: ");
			nome[i] = input.next();

			System.out.println("\nIdade:");
			idade[i] = input.nextInt();

			System.out.println("\nAltura:");
			altura[i] = input.nextDouble();

		}

		double alturaMedia = 0.0;
		double alturaT = 0.0;
		for (int i = 0; i < altura.length; i++) {
			alturaT += altura[i];

		}
		alturaMedia = alturaT / altura.length;

		int cont = 0;
		for (int i = 0; i < altura.length; i++) {
			if (idade[i] < 16) {
				cont++;
			}

		}
		double porcentagem = cont * 100.0 / n;

		System.out.println("Altura Media: " + alturaMedia);
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem);

		for (int i = 0; i < altura.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		input.close();

	}

}
