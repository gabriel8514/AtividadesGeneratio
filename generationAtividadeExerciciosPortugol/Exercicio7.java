package generationAtividadeExerciciosPortugol;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		double A, B, C, D, E, F, X, Y;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = ler.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = ler.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = ler.nextDouble();
		System.out.println("Digite o valor de D: ");
		D = ler.nextDouble();
		System.out.println("Digite o valor de E: ");
		E = ler.nextDouble();
		System.out.println("Digite o valor de F: ");
		F = ler.nextDouble();
		
		X = ((C*E) - (B*F)) / ((A*E) - (B*D));
		Y = ((A*F) - (C*D)) / ((A*E) - (B*D));

	System.out.println("O resultado da equação é de X = " + X + " e Y = " + Y);
	
	}
}
