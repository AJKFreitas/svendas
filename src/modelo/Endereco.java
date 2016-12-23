package modelo;

import enumerator.EnumTipoLogradouro;

public class Endereco {

	private EnumTipoLogradouro logradouro;
	
	private String nome;
	
	private String complemento;
	
	private Integer numero;
	
	private String bairro;
	
	private String cidade;
	
	private String uf;
	
	private String cep;
	
	private String pais;

	public EnumTipoLogradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(EnumTipoLogradouro logradouro) {
		this.logradouro = logradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
