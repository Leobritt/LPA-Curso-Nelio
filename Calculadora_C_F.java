package LPA_2;

import java.util.*;

public class Calculadora_C_F {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		
		double resp;
		do {	
			System.out.println("-----Caculadora Celcius Para Fahrenheit-----");
			System.out.println("Informe um valor em Celcius:");
			double tempCel = input.nextDouble();
			double tempF = 0.0;
			tempF = 9.0 * tempCel / 5 + 32;
			
			System.out.println("Valor digitado em celcius: "+tempCel+"°C");
			System.out.println("Valor em "+ tempF +"°F");
			System.out.println("Deseja repetir? (s/n)");
			resp = input.next().charAt(0);
		} while (resp != 'n');
		input.close();
	}

}
