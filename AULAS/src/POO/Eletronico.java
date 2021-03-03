package POO;

public class Eletronico {

	private int chip;
	private String modelo;
	private String numeroDeSerie;
	private String empresa;
	
	public Eletronico(int chip, String modelo, String numeroDeSerie, String empresa) {
		super();
		this.chip = chip;
		this.modelo = modelo;
		this.numeroDeSerie = numeroDeSerie;
		this.empresa = empresa;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
	
}
