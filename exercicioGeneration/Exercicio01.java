package exercicioGeneration; 

import java.util.Scanner;

public class Exercicio01 { 

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int valor, maior = 0;

		System.out.println("Digite 3 valores: ");
		valor = ler.nextInt();
		valor = ler.nextInt();
		valor = ler.nextInt();

		if (valor > maior) {
			maior = valor;
		}
		System.out.println("O maior valor digitado é: " + valor);
		ler.close();
	}
}
