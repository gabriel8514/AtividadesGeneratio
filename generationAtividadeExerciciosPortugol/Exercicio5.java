/* Exercicio 5 Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
	respectivamente.
	* Autor: Gabriel Reis 
	* Data: 01/07/2021
*/
package generationAtividadeExerciciosPortugol;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		double nota1, nota2, nota3, media;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a 1� nota: ");
		nota1 = ler.nextDouble();

		System.out.println("Digite a 2� nota: ");
		nota2 = ler.nextDouble();

		System.out.println("Digite a 3� nota: ");
		nota3 = ler.nextDouble();

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

		System.out.println("A media ponderada de " + nota1 + " " + nota2 + " e " + nota3 + " � de " + media);
	}
}
