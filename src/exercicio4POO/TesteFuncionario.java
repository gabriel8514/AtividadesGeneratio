package exercicio4POO;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funci1 = new Funcionario();
		
		funci1.setAnosDeEmpresa(3);
		funci1.setCargo("Analista senior");
		funci1.setSalario(15800.98);
		funci1.setNome("Gabriel Reis");
		
		funci1.aumento(10); 
		
		System.out.println("---- Dados Funcionario ----");
		System.out.println("Nome: " + funci1.getNome());
		System.out.println("Cargo: " + funci1.getCargo());
		System.out.println("Salario: " + funci1.getSalario());
		System.out.println("Anos na empresa: " + funci1.getAnosDeEmpresa());
		System.out.println("Salario com aumento: " + funci1.getSalarioComAumento()); 
	}
	
}
