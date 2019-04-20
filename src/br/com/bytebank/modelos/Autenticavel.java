package br.com.bytebank.modelos;

public abstract interface Autenticavel   {
	
	public void setSenha (int senha);
		
	public boolean autentica (int senha) ;
}
