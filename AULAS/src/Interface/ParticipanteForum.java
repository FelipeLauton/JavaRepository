package Interface;

public class ParticipanteForum implements Leitor,Programador{
	
	String pensando;
	public String lendo() {
		return "Forum";
	}
	public void pensando(char ideias[]) {
		pensando = new String(ideias);
	}
	public String digitando() {
		return pensando;
	}
	private String aprendendo() {
		return "JAVA";
	}

}
