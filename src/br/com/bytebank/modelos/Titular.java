package br.com.bytebank.modelos;

public class Titular {
	private String nome; 
	private String CPF;
	private String profissao;
	
	public Titular (String nome, String cpf, String profissao) {
		this.setNome(nome);
		this.setCPF(cpf);
		this.setProfissao(profissao);
	}
	
	

	public Titular() {
		// TODO Auto-generated constructor stub
	}



	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}	

}
