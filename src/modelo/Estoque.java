
package modelo;

public class Estoque {
	private int idProduto;
	private int quantidadeEstoque;
	private boolean Status;
	private int estoqueReserva;
	private String Data;

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean Status) {
		this.Status = Status;
	}

	public int getEstoqueReserva() {
		return estoqueReserva;
	}

	public void setEstoqueReserva(int estoqueReserva) {
		this.estoqueReserva = estoqueReserva;
	}

	public String getData() {
		return Data;
	}

	public void setData(String Data) {
		this.Data = Data;
	}

}
