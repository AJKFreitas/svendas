package modelo;

public abstract class PessoaJuridica extends Pessoa {

	private String cnpj;
	
	public PessoaJuridica(String nome, String telefone) {
		super(nome, telefone);
	}

}
