package exerciciosHerancasPolimorfismo;

import java.util.Scanner;

public class TestaAnimal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Cachorro cachorro1 = new Cachorro();
		
		System.out.print("Escreva a idade do cachorro: ");
		cachorro1.setIdade(ler.nextInt());
		System.out.print("Escreva o nome do cachorro: ");
		cachorro1.setNome(ler.next()); 

		Cavalo cavalo1 = new Cavalo();

		cavalo1.setIdade(10);
		cavalo1.setNome("Shelby");

		Preguica preguica1 = new Preguica(); 

		preguica1.setIdade(8);
		preguica1.setNome("Frederico");
		
		System.out.println("--- Cachorro --- ");
		System.out.println("Nome: " + cachorro1.getNome());
		System.out.println("Idade: " + cachorro1.getIdade());
		cachorro1.correr();  
		cachorro1.som(); 

		System.out.println("\n--- Cavalo --- ");
		System.out.println("Nome: " + cavalo1.getNome());
		System.out.println("Idade: " + cavalo1.getIdade());
		cavalo1.correr();  
		cavalo1.som(); 
		
		System.out.println("\n--- Preguiça --- ");
		System.out.println("Nome: " + preguica1.getNome());
		System.out.println("Idade: " + preguica1.getIdade());
		preguica1.subirArvore();  
		preguica1.som(); 
	}
}
