/* Exercicio 3 Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	* Autor: Gabriel Reis 
	* Data: 01/07/2021
*/

package generationAtividadeExerciciosPortugol;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args){
		
		int totalSegundos, horas, minutos, segundos;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Total de segundos a serem convertidos: ");
		totalSegundos = ler.nextInt();
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = totalSegundos % 3600 % 60; 

		System.out.println(totalSegundos + " Segundos s�o equivalente a " + horas + " horas " + minutos + " minutos " + segundos + " segundos ");
	}
}
