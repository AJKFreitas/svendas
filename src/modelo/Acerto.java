package modelo;

public class Acerto {

	private int idAcerto;
	private int idFornecedor;
	private int idkitProdutos;
	private String dataAcerto;
	private float comissao;
	private float valorAceto;

	public Acerto(int idAcerto, int idFornecedor, int idkitProdutos, String dataAcerto, float comissao,
			float valorAceto) {
		this.idAcerto = idAcerto;
		this.idFornecedor = idFornecedor;
		this.idkitProdutos = idkitProdutos;
		this.dataAcerto = dataAcerto;
		this.comissao = comissao;
		this.valorAceto = valorAceto;
	}

	public int getIdAcerto() {
		return idAcerto;
	}

	public void setIdAcerto(int idAcerto) {
		this.idAcerto = idAcerto;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public int getIdkitProdutos() {
		return idkitProdutos;
	}

	public void setIdkitProdutos(int idkitProdutos) {
		this.idkitProdutos = idkitProdutos;
	}

	public String getDataAcerto() {
		return dataAcerto;
	}

	public void setDataAcerto(String dataAcerto) {
		this.dataAcerto = dataAcerto;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float getValorAceto() {
		return valorAceto;
	}

	public void setValorAceto(float valorAceto) {
		this.valorAceto = valorAceto;
	}

}
