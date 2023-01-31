package LPA;

import java.util.*;

public class Ex003 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double raio, area;
		double pi = 3.14;

		System.out.println("Informe o valor do raio: ");
		raio = input.nextDouble();
		area = pi * raio * raio;
		System.out.printf("O valor do raio é:  %.4f %n ", area);
		input.close();
	}

}
