package sistemaDeProjetos;

import java.util.*;

public class Professor extends Pessoa{
	
	private String tipo;
	
	Professor(String nome, String tipo){
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
