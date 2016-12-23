
package modelo;

public class Fornecedor {
	private int idFornecedor;
	private String nomeFornecedor;
	private String empresa;
	private String Produto;
	private String tpAcerto;
	private KitProduto idkitProduto;
	private int codFornecedorKitProduto;
	public int getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getProduto() {
		return Produto;
	}
	public void setProduto(String produto) {
		Produto = produto;
	}
	public String getTpAcerto() {
		return tpAcerto;
	}
	public void setTpAcerto(String tpAcerto) {
		this.tpAcerto = tpAcerto;
	}
	public KitProduto getIdkitProduto() {
		return idkitProduto;
	}
	public void setIdkitProduto(KitProduto idkitProduto) {
		this.idkitProduto = idkitProduto;
	}
	public int getCodFornecedorKitProduto() {
		return codFornecedorKitProduto;
	}
	public void setCodFornecedorKitProduto(int codFornecedorKitProduto) {
		this.codFornecedorKitProduto = codFornecedorKitProduto;
	}

	

}
