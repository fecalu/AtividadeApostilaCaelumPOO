package pag_95_ex3;

public class Banco {
	
	private Conta[] contasBancarias = new Conta[100];
	
	private int qntContas = 0;

	
	public void adicionar(Conta conta) {
		
		for (int i = 0; i < contasBancarias.length; i++) {
			this.contasBancarias[qntContas] = conta;
		}
		
		qntContas++;
	}
	
	
	
	public Conta pegaConta(int x) { 
		return this.contasBancarias[x];
	}
	
	public int totalDeContas() {
		return this.qntContas;
	}
	
	
	
	
	
}
