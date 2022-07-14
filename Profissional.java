package sistemaDeProjetos;

public class Profissional extends Pessoa{
	
	private String tipo;
	
	Profissional(String nome, String tipo){
		super(nome);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
