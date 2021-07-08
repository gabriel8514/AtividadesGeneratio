package exercicio4POO;

public class Funcionario {
	
	// Atributos 
	private String nome;
	private String Cargo;
	private int anosDeEmpresa;
	private double salario;
	private double salarioComAumento; 
	
	// Metodo para dar aumento. 
	void aumento(int porcento) {
		salarioComAumento = salario + ((salario / 100) * porcento); 
	}
	
	public double getSalarioComAumento() {
		return salarioComAumento;
	}

	public void setSalarioComAumento(double salarioComAumento) {
		this.salarioComAumento = salarioComAumento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public int getAnosDeEmpresa() {
		return anosDeEmpresa;
	}
	public void setAnosDeEmpresa(int anosDeEmpresa) {
		this.anosDeEmpresa = anosDeEmpresa;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	} 

}
