package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Array_Dados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n, qtH, qtM;
		double menorAltu, maiorAltu, alturaFemMedia, alturaFT;

		System.out.println("Quantas pessoas serão digitadas:");
		n = input.nextInt();

		double[] altura = new double[n];
		char[] generos = new char[n];

		for (int i = 0; i < generos.length; i++) {
			System.out.println("Altura da pessoa " + i + 1);
			altura[i] = input.nextDouble();

			System.out.println("Genero da pessoa " + i + 1);
			generos[i] = input.next().charAt(0);

		}
		menorAltu = altura[0];
		maiorAltu = altura[0];

		for (int i = 0; i < generos.length; i++) {
			if (menorAltu > altura[i]) {
				menorAltu = altura[i];

			}
			if (maiorAltu < altura[i]) {
				maiorAltu = altura[i];
			}

			qtH = 0;
			qtM = 0;
			alturaFemMedia = 0;
			alturaFT = 0;

			for (int j = 0; j < generos.length; j++) {
				if (generos[i] == 'F' || generos[i] == 'f') {
					qtH++;
				} else {
					qtM++;
					alturaFT += altura[i];
				}

				alturaFemMedia = alturaFT / qtM++;
			}

			System.out.println("Menor Altura: " + menorAltu);
			System.out.println("Maior Altura: " + maiorAltu);
			System.out.println("Media das Alturas das Mulheres: " + alturaFemMedia);
			System.out.println("Número de Homens: " + qtH);

		}

		input.close();
	}
}
