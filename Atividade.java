package sistemaDeProjetos;

import java.util.*;

public class Atividade {
	
	private String identificacao;
	private String descricao;
	private String data;
	private String horaInicio;
	private String horaTermino;
	private Pessoa responsavel;
	private ArrayList<Profissional> profissionais;
	private ArrayList<Tarefa> tarefas;


	public Atividade(String identificacao, String descricao, String data, String horaInicio, String horaTermino,
			Pessoa responsavel, ArrayList<Profissional> profissionais, ArrayList<Tarefa> tarefas) {
		this.identificacao = identificacao;
		this.descricao = descricao;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
		this.responsavel = responsavel;
		this.profissionais = profissionais;
		this.tarefas = tarefas;
	}

	public String getIdentificacao() {
		return identificacao;
	}


	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHoraInicio() {
		return horaInicio;
	}


	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}


	public String getHoraTermino() {
		return horaTermino;
	}


	public void setHoraTermino(String horaTermino) {
		this.horaTermino = horaTermino;
	}


	public Pessoa getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}


	public ArrayList<Profissional> getProfissionais() {
		return profissionais;
	}


	public void setProfissionais(ArrayList<Profissional> profissionais) {
		this.profissionais = profissionais;
	}
	
	public ArrayList<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(ArrayList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
}
