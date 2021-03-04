package POO;

public class Preguica extends Animal{
	private boolean subirEmArvores;

	public boolean isSubirEmArvores() {
		return subirEmArvores;
	}

	public void setSubirEmArvores(boolean subirEmArvores) {
		this.subirEmArvores = subirEmArvores;
	}
	
	public String getSom() {
		return "Preguiça: "+super.getNome()+ " está fazendo sons silenciosos.";
	}

}
