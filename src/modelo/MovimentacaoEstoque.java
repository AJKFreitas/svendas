
package modelo;

public class MovimentacaoEstoque {
	private int MMovimentacao;
	private int idtipoMovimentacao;
	private String dataMovimentacao;
	private int idVenda;
	private int idDevolucao;
	private int idAcerto;

	public int getMMovimentacao() {
		return MMovimentacao;
	}

	public void setMMovimentacao(int MMovimentacao) {
		this.MMovimentacao = MMovimentacao;
	}

	public int getIdtipoMovimentacao() {
		return idtipoMovimentacao;
	}

	public void setIdtipoMovimentacao(int idtipoMovimentacao) {
		this.idtipoMovimentacao = idtipoMovimentacao;
	}

	public String getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(String dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public int getIdDevolucao() {
		return idDevolucao;
	}

	public void setIdDevolucao(int idDevolucao) {
		this.idDevolucao = idDevolucao;
	}

	public int getIdAcerto() {
		return idAcerto;
	}

	public void setIdAcerto(int idAcerto) {
		this.idAcerto = idAcerto;
	}

}
