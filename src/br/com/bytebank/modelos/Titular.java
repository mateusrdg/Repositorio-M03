package br.com.bytebank.modelos;

public class Titular implements Comparable<Titular>{
	private String nome; 
	private String CPF;
	private String profissao;
	private Integer id;
	

	public Titular (String nome, String cpf, String profissao,Integer id) {
		this.setNome(nome);
		this.setCPF(cpf);
		this.setProfissao(profissao);
		this.setId(id);
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
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return this.id + this.nome ;
	}

	@Override
	public int compareTo(Titular t) {	
		return this.id.compareTo(t.id);
	}
	
	

}
