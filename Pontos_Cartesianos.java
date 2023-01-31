package LPA_2;

import java.util.*;

public class Pontos_Cartesianos {
	public static void main(String[] args) {
		int x, y;
		Scanner input = new Scanner(System.in);

		System.out.println("Informe os valores do ponto cartesiano");

		x = input.nextInt();
		y = input.nextInt();

		while (x != 0 || y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primneiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			x = input.nextInt();
			y = input.nextInt();
		}
		 input.close();
	}

}
