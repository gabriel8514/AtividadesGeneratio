package exerciciosHerancasPolimorfismo;

public class Cachorro extends Animal {
	
	private String Correr;
	
	public String getCorrer() {
		return Correr;
	}

	public void setCorrer(String correr) {
		Correr = correr;
	}

	void correr () {
		System.out.println("Esse animal corre");  
	}

}
