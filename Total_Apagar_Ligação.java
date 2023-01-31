package LPA;

import java.util.*;

public class Total_Apagar_Ligação {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int minutes;
		double total_pay = 50.0;

		System.out.println("Informe os minutos de ligação:");
		minutes = input.nextInt();

		if (minutes > 100) {
			total_pay = total_pay + (minutes - 100) * 2.0;
		}
		System.out.printf("Valor a pagar: %.2f", total_pay);
		input.close();
	}
}