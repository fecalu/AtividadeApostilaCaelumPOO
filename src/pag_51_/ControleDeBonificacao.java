package pag_51_;

public class ControleDeBonificacao {

	private double totalDeBonificacoes = 0;
	
	public void registrta(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	
	public double getTotalDeBonificacao() {
		return this.totalDeBonificacoes;
	
	}
}
