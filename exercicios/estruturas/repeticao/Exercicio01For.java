/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
Autor: Gabriel Reis
Data: 05/07/2021
 */

package exercicios.estruturas.repeticao;

public class Exercicio01For {

	public static void main(String[] args) {

		int resto = 0;

		for (int cont = 1000; cont <= 1999; cont++) {

			resto = cont % 11;

			if (resto == 5) {
				System.out.println(cont);
			}
		}
	}
}
