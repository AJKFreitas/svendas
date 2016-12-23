
package modelo;

public class Devolucao {
	private int idVenda;
	private float valorDevolvido;
	private String motivoDevolucao;
	private int idCliente;

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public float getValorDevolvido() {
		return valorDevolvido;
	}

	public void setValorDevolvido(float valorDevolvido) {
		this.valorDevolvido = valorDevolvido;
	}

	public String getMotivoDevolucao() {
		return motivoDevolucao;
	}

	public void setMotivoDevolucao(String motivoDevolucao) {
		this.motivoDevolucao = motivoDevolucao;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

}
