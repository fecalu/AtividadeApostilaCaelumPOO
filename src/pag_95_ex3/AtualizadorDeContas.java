package pag_95_ex3;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo atual: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	
	
}
