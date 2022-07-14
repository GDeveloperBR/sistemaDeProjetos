package sistemaDeProjetos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Sistema {
	
	private static Sistema sistema;
	
	private Sistema() {}
	
	public static  Sistema getInstance() {
		if(sistema == null) {
			sistema = new Sistema();
		}
		return sistema;
	}
	
	public void run() {
			ArrayList<Projeto> projetos;
			ArrayList<Login> logins;
			Scanner s;
			boolean sair, sair2;
			int entrada, entrada2;
			
			
			projetos = new ArrayList<Projeto>();
			logins = new ArrayList<Login>();
			s = new Scanner(System.in);
			sair = false;
			entrada = 3;
			entrada2 = 3;
			
			while(!sair) {
				do {
					System.out.println("[1] FAZER LOGIN");
					System.out.println("[2] FAZER CADASTRO");
					System.out.println("[3] SAIR");
					System.out.print("-->");
					try {
						entrada = s.nextInt();
					} catch (InputMismatchException e) {
						e.printStackTrace();
					}
				} while(entrada < 1 || entrada > 3);
				
				switch(entrada) {
					case 1:	
							System.out.print("NOME: ");
							String nome = s.next();
							System.out.print("SENHA: ");
							String senha = s.next();
							boolean cadastrado = false;
							for(int i = 0; i < logins.size(); i++) {
								if(nome.equals(logins.get(i).getNome()) && senha.equals(logins.get(i).getSenha())) {
									cadastrado = true;
									break;
								}
							}
							
							if(cadastrado) {
								sair2 = false;
								while(!sair2) {
									do {
										System.out.println("[1] ADICIONAR PROJETO");
										System.out.println("[2] RELATORIO DE PROJETOS");
										System.out.println("[3] SAIR");
										System.out.print("-->");
										try {
											entrada2 = s.nextInt();
										} catch (InputMismatchException e) {
											e.printStackTrace();
										}
									} while(entrada2 < 1 || entrada2 > 3);
									
									switch(entrada2) {
										case 1:
												ArrayList<Profissional> profissionais = new ArrayList<Profissional>();
												ArrayList<Atividade> atividades = new ArrayList<Atividade>();
												System.out.print("Digite a identidicacao: ");
												String identificacao = s.next();
												System.out.print("Digite o status: ");
												String status = s.next();
												System.out.print("Digite a descricao: ");
												String descricao = s.next();
												System.out.print("Digite a data: ");
												String data = s.next();
												System.out.print("Digite a hora de inicio: ");
												String horaInicio = s.next();
												System.out.print("Digite a hora de termino: ");
												String horaTermino = s.next();
												System.out.print("Digite o nome do professor coordenador: ");
												String coordenador = s.next();
												System.out.print("Digite o tipo de professor (Professor/Pesquisador): ");
												String tipoCoordenador = s.next();
												System.out.print("Digite quantos profissionais serao cadastrados: ");
												
												int n = 0;
												
												try {
													n = s.nextInt();
												} catch (InputMismatchException e) {
													e.printStackTrace();
												}
												
												for(int j = 0; j < n; j++) {
													System.out.print("Digite o nome do profissional " + (j+1) + ": ");
													String nomeProfissional = s.next();
													System.out.print("Digite o tipo do profissional " + (j+1) + ": ");
													String tipoProfissional = s.next();
													profissionais.add(new Profissional(nomeProfissional, tipoProfissional));
													System.out.println("#Profissional registrado com sucesso!");
												}
												
												System.out.print("Digite quantas atividades serao cadastradas: ");
												
												int n2 = 0;
														
												try {
													n2 = s.nextInt();
												} catch (InputMismatchException e) {
													e.printStackTrace();
												}
												
												for(int k = 0; k < n2; k++) {
													ArrayList<Profissional> profissionaisAtividade = new ArrayList<Profissional>();
													ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
													System.out.print("Digite a identidicacao da atividade " + (k+1) + ": ");
													String identificacao2 = s.next();
													System.out.print("Digite a descricao: ");
													String descricao2 = s.next();
													System.out.print("Digite a data: ");
													String data2 = s.next();
													System.out.print("Digite a hora de inicio: ");
													String horaInicio2 = s.next();
													System.out.print("Digite a hora de termino: ");
													String horaTermino2 = s.next();
													System.out.print("Digite o nome da pessoa responsavel: ");
													String responsavel = s.next();
													Pessoa p = new Pessoa(responsavel);
													System.out.print("Digite quantos profissionais serao cadastrados: ");
													
													int n3 = 0;
													
													try {
														n3 = s.nextInt();
													} catch (InputMismatchException e) {
														e.printStackTrace();
													}
													
													for(int l = 0; l < n3; l++) {
														System.out.print("Digite o nome do profissional " + (l+1) + ": ");
														String nomeProfissional2 = s.next();
														System.out.print("Digite o tipo do profissional " + (l+1) + ": ");
														String tipoProfissional2 = s.next();
														System.out.print("Digite a tarefa do profissional " + (l+1) + ": ");
														String tarefa = s.next();
														profissionaisAtividade.add(new Profissional(nomeProfissional2, tipoProfissional2));
														tarefas.add(new Tarefa(new Profissional(nomeProfissional2, tipoProfissional2), tarefa));
														System.out.println("#Profissional inserido com sucesso!");
													}
													atividades.add(new Atividade(identificacao2, descricao2, data2, horaInicio2, horaTermino2, p, profissionaisAtividade, tarefas));
													System.out.println("#Atividade registrada com sucesso!");
												}
												projetos.add(new Projeto(identificacao, status, descricao, data, horaInicio, horaTermino, new Professor(coordenador, tipoCoordenador), profissionais, atividades));
												System.out.println("#Projeto registrado com sucesso!");
												break;
													
										case 2:
												System.out.println("-----PROJETOS-----");
												for(Projeto p : projetos) {
													System.out.println("IDENTIFICACAO: " + p.getIdentificacao());
													System.out.println("STATUS: " + p.getStatus());
													System.out.println("DESCRICAO: " + p.getDescricao());
													System.out.println("DATA: " + p.getData());
													System.out.println("HORA INICIO: " + p.getHoraInicio());
													System.out.println("HORA TERMINO: " + p.getHoraTermino());
													System.out.println("NOME COORDENADOR: " + p.getCoordenador().getNome());
													System.out.println("TIPO COORDENADOR: " + p.getCoordenador().getTipo());
													System.out.println("-----LISTA DE PROFISSIONAIS-----");
													for(Profissional pr : p.getProfissional()) {
														System.out.println("NOME: " + pr.getNome());
														System.out.println("TIPO: " + pr.getTipo());
														System.out.println("--");
													}
													System.out.println("-----LISTA DE ATIVIDADES-----");
													for(Atividade a : p.getAtividades()) {
														System.out.println("IDENTIFICACAO: " + a.getIdentificacao());
														System.out.println("DESCRICAO: " + a.getDescricao());
														System.out.println("DATA: " + a.getData());
														System.out.println("HORA INICIO: " + a.getHoraInicio());
														System.out.println("HORA TERMINO: " + a.getHoraTermino());
														System.out.println("NOME RESPONSAVEL: " + a.getResponsavel().getNome());
														System.out.println("-----LISTA DE PROFISSIONAIS-----");
														for(Profissional pr : a.getProfissionais()) {
															System.out.println("NOME: " + pr.getNome());
															System.out.println("TIPO: " + pr.getTipo());
															System.out.println("--");
														}
														System.out.println("-----LISTA DE TAREFAS-----");
														for(Tarefa t : a.getTarefas()) {
															System.out.println("NOME DO PROFISSIONAL: " + t.getProfissional().getNome());
															System.out.println("TIPO DO PROFISSIONAL: " + t.getProfissional().getTipo());
															System.out.println("TAREFA: " + t.getTarefa());
															System.out.println("--");
														}
													}
												}
												break;
										case 3:
												sair2 = true;
												break;
									}
								}
							} else {
								System.out.println("#Login Incorreto!");
							}
							
							break;
					case 2: 
							System.out.print("NOME: ");
							String nome2 = s.next();
							System.out.print("SENHA: ");
							String senha2 = s.next();
							logins.add(new Login(nome2, senha2));
							System.out.println("#CADASTRO REALIZADO COM SUCESSO!");
							break;
						
					case 3:
							sair = true;
							s.close();
							break;
				}
			}
	}
}
