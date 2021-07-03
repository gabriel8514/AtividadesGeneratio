package exercicioGeneration;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int valor1, valor2, valor3; 

		System.out.println("Digite 3 valores: ");
		System.out.print("Valor 1: ");
		valor1 = ler.nextInt();
		System.out.print("Valor 2: ");
		valor2 = ler.nextInt();
		System.out.print("Valor 3: ");
		valor3 = ler.nextInt();

		if (valor1 < valor2) {
			if (valor2 < valor3) {
				System.out.println(valor1 + " " + valor2 + " " + valor3);
			} else if (valor1 < valor2) {
				System.out.println(valor1 + " " + valor3 + " " + valor2);
			} else {
				System.out.println(valor3 + " " + valor1 + " " + valor2);
			}
		} else if (valor2 < valor3) {
			if (valor1 < valor3) {
				System.out.println(valor2 + " " + valor1 + " " + valor3);
			} else {
				System.out.println(valor2 + " " + valor3 + " " + valor1); // o erro tava aqui
			}
		} else {
			System.out.println(valor3 + " " + valor2 + " " + valor1);
		}
		ler.close();
	}
}
