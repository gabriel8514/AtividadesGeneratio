package exercicio6POO;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c1 =  new Conta();
		
		c1.setNome("Gabriel Reis");
		c1.setTipo("Cart�o Black");	
		c1.setGasto(2500.68);
		c1.setLimite(38000.90);
		
		c1.compras(2500.68);
		
		System.out.println("--- Dados da Conta/Cart�o ---\n");
		System.out.println("Nome : " + c1.getNome());
		System.out.println("Tipo do cart�o : " + c1.getTipo());
		System.out.println("Limite total : R$ " + c1.getLimite());
		System.out.println("Gasto : R$ " + c1.getGasto());
		System.out.println("Limite disponivel : R$ " + c1.getLimiteDisponivel()); 
	} 
}
