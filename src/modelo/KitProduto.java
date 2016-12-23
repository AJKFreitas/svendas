
package modelo;

public class KitProduto {
	private int idProduto;
	private int idkitProdutos;
	private int idFornecedor;
	private String dataChegada;
	private String dataAcerto;
	private float valorKit;

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getIdkitProdutos() {
		return idkitProdutos;
	}

	public void setIdkitProdutos(int idkitProdutos) {
		this.idkitProdutos = idkitProdutos;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}

	public String getDataAcerto() {
		return dataAcerto;
	}

	public void setDataAcerto(String dataAcerto) {
		this.dataAcerto = dataAcerto;
	}

	public float getValorKit() {
		return valorKit;
	}

	public void setValorKit(float valorKit) {
		this.valorKit = valorKit;
	}

}
