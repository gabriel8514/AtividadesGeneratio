/* 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.
Autor: Gabriel Reis
Data: 05/07/2021
 */

package exercicios.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio04While {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade = 0, sexo = 0, emocional = 0, totalCalma = 0, totalMuleresNervosas = 0, totalHomensAcresivos = 0;
		int totalOutrosCalmos = 0, totalMais40Nervoso = 0, totalMenos18Calmo = 0, cont = 0;

		// idade
		while (cont < 4) {
			System.out.print("Digite a idade: ");
			idade = ler.nextInt();
			System.out.print("Digite o sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = ler.nextInt();
			System.out.print("Digite o perfil psicológico (1-calma / 2-Nervosa / 3-Agressiva): ");
			emocional = ler.nextInt();
			cont++;

			if (emocional == 1) {
				totalCalma++;
			}
			if (sexo == 1 && emocional == 2) {
				totalMuleresNervosas++;
			}
			if (sexo == 2 && emocional == 3) {
				totalHomensAcresivos++;
			}
			if (sexo == 3 && emocional == 1) {
				totalOutrosCalmos++;
			}
			if (idade > 40 && emocional == 2) {
				totalMais40Nervoso++;
			}
			if (idade < 18 && emocional == 1) {
				totalMenos18Calmo++;
			}
		}

		System.out.println("Total de pessoal calmas: " + totalCalma);
		System.out.println("Total de mulheres nervosas: " + totalMuleresNervosas);
		System.out.println("Total de homens agressivos: " + totalHomensAcresivos);
		System.out.println("Total de outros calmos: " + totalOutrosCalmos);
		System.out.println("Total de pessoas nervosas com mais de 40: " + totalMais40Nervoso);
		System.out.println("Total de pessoal calmas com menos de 18: " + totalMenos18Calmo);
		ler.close();
	}
}
