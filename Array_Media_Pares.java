package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Array_Media_Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int tam = input.nextInt();

		int[] arr = new int[tam];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Digite os números:");
			arr[i] = input.nextInt();
		}

		int aux = 0;
		
		for (int i = 0; i < arr.length; i++) {
			aux = arr[i];
			if(aux % 2 == 0) {
				int avg = aux/arr.length;
				System.out.println(avg);
			}else {
				System.out.println("Não tem pares");
			}
		}
		input.close();
	}

}
