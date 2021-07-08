package exercicio5POO;

public class TestaPatinete {

	public static void main(String[] args) {
		
		Patinete pat1 = new Patinete();
		
		pat1.setCor("Vermelho");
		pat1.setIdadeIndicada(12);
		pat1.setTipo("Eletrico");
		pat1.setValor(800);
		
		System.out.println("--- Info Patinete ---");
		System.out.println("COR: " + pat1.getCor());
		System.out.println("Idade indicada: " + pat1.getIdadeIndicada() + " anos");
		System.out.println("Tipo: " + pat1.getTipo());
		System.out.println("Valor: " + pat1.getValor());
	}
}
