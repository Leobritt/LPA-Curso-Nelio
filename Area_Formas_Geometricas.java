package LPA;

import java.util.*;

public class Area_Formas_Geometricas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double a, b, c, aux;

		System.out.println("Informe três valores:");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		aux = (a * c) / 2;
		System.out.printf("Triangulo: %.3f\n", aux);
		
		aux = 3.14159*c*c;
		System.out.printf("Circulo: %.3f\n",aux);
		
		aux = ((a+b)*c)/2;
		System.out.printf("Trapezio: %.3f\n",aux);
		
		aux = b*b;
		System.out.printf("Quadrado: %.3f\n",aux);
		
		aux = a*b;
		System.out.printf("Retangulo: %.3f\n",aux);

		input.close();
	}

}
