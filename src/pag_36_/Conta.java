package pag_36_;

class Conta {
	
	int numero;
	String dono;
	double saldo;
	double limite;
	
	boolean saca (double valor) {
		
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	boolean transfere(Conta destino, double valor) {
		
		boolean retirou = this.saca(valor);
		
		if (retirou) {
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
}
