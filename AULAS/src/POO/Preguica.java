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
		return "Pregui�a: "+super.getNome()+ " est� fazendo sons silenciosos.";
	}

}
