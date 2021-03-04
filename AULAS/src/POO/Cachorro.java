package POO;

public class Cachorro extends Animal{
	private boolean correr;

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	public String getSom() {
		return "Cachorro: "+super.getNome()+ " está latindo.";
	}
}
