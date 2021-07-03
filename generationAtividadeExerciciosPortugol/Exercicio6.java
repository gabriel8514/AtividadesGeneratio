package generationAtividadeExerciciosPortugol;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double P1, P2, X1, X2, Y1, Y2, DResult; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de X do 1º plano: ");
		X1 = ler.nextDouble();
		
		System.out.println("Digite o valor de Y do 1º plano: ");
		Y1 = ler.nextDouble();
		
		System.out.println("Digite o valor de X do 2º plano: ");
		X2 = ler.nextDouble();
		
		System.out.println("Digite o valor de X do 2º plano: ");
		Y2 = ler.nextDouble(); 

		P1 = Math.pow((X2-X1), 2.0);
		P2 = Math.pow((Y2-Y1), 2.0); 

		DResult = Math.sqrt(P1 + P2); 

		System.out.println("A distância entre os planos digitados é de: " + DResult);

	}
}
