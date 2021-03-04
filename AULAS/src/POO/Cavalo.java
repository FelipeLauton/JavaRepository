package POO;

public class Cavalo extends Animal{
	private boolean correr;

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	public String getSom() {
		return "Cavalo: "+super.getNome()+ " está guinchando.";
	}

}
