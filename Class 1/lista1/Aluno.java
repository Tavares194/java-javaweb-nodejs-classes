package lista1;


public class Aluno extends Pessoa {

	private String prontuario;
	
	public Aluno() {
		super();
		this.prontuario = "";
	}
	public Aluno( String nome, Integer dia, Integer mes, Integer ano, String prontuario ){
		super(nome,dia,mes,ano);
		this.prontuario = prontuario;
	}
	
	public String getProntuario() {
		return this.prontuario;
	}
	public void setProntuario( String prontuario ) {
		this.prontuario = prontuario;
	}
	
	public String toString() {
		return super.toString() + "[prontuario: " + this.prontuario + "]";
	}
	
}
