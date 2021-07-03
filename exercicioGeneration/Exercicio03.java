package exercicioGeneration;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.print("Informe sua idade: ");
		idade = ler.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("INFANTIL");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("JUVENIL");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("ADULTO");
		} else {
			System.out.println("IDADE INVALIDA");
		}
		ler.close();
	}
}
