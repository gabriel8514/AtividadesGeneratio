package exercicio7POO;

public class TestaPasciente {

	public static void main(String[] args) {

		Pasciente p1 = new Pasciente();

		p1.setNome("Rodolfo da Silva");
		p1.setIdade(24);
		p1.setConvenio("Intermedica");
		p1.setCPF("443.658.968/52");
		p1.setEndere�o("Rua das cassimbinhas 76, Paraventi - SP");

		System.out.println("--- Dados Pasciente ---");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("CPF: " + p1.getCPF());
		System.out.println("Endere�o: " + p1.getEndere�o());
		System.out.println("Convenio: " + p1.getConvenio());
	}
}
