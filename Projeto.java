package sistemaDeProjetos;

import java.util.*;

public class Projeto {
	
	private String identificacao;
	private String status;
	private String descricao;
	private String data;
	private String horaInicio;
	private String horaTermino;
	private Professor coordenador;
	private ArrayList<Profissional> profissional;
	private ArrayList<Atividade> atividades;
	
	public Projeto(String identificacao, String status, String descricao, String data, String horaInicio, String horaTermino,
			Professor coordenador, ArrayList<Profissional> profissional, ArrayList<Atividade> atividades) {

		this.identificacao = identificacao;
		this.status = status;
		this.descricao = descricao;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
		this.coordenador = coordenador;
		this.profissional = profissional;
		this.atividades = atividades;
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

	public Professor getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}

	public ArrayList<Profissional> getProfissional() {
		return profissional;
	}

	public void setProfissional(ArrayList<Profissional> profissional) {
		this.profissional = profissional;
	}

	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(ArrayList<Atividade> atividades) {
		this.atividades = atividades;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
