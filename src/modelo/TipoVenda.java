
package modelo;

public class TipoVenda {
	private int idtpVenda;
	private String Descricao;
	private int idFormaPagamento;
	private boolean Status;

	public int getIdtpVenda() {
		return idtpVenda;
	}

	public void setIdtpVenda(int idtpVenda) {
		this.idtpVenda = idtpVenda;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String Descricao) {
		this.Descricao = Descricao;
	}

	public int getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(int idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean Status) {
		this.Status = Status;
	}

}
