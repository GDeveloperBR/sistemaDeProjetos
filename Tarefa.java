package sistemaDeProjetos;

public class Tarefa {
	
	private Profissional profissional;
	private String tarefa;
	
	Tarefa(Profissional profissional, String tarefa){
		this.profissional = profissional;
		this.tarefa = tarefa;
	}
	
	public Profissional getProfissional() {
		return profissional;
	}
	
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	
	public String getTarefa() {
		return tarefa;
	}
	
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
}
