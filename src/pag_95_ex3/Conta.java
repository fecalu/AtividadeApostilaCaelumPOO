package pag_95_ex3;

public abstract class Conta {

	protected double saldo;
	
	Conta(){
		
	}
	
	Conta(double saldo){
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	//metodos
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	abstract public void atualiza(double taxa); 
}
