package pag_95_ex3;

public class ContaPoupanca extends Conta {

	
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa *3;
	}
}
