
package modelo;

/**
 *
 * @author angelo.santos
 */
public class ItenVenda {
	private int idProduto;
	private int idVenda;

	public ItenVenda(int idProduto, int idVenda) {
		this.idProduto = idProduto;
		this.idVenda = idVenda;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
}
