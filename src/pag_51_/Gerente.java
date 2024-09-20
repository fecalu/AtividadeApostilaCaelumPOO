package pag_51_;

public class Gerente extends Funcionario {
	
	private int senha;
	private static int numDeFuncionariosGerenciados;
	
	
	
	public Gerente() {
		Gerente.numDeFuncionariosGerenciados = Gerente.numDeFuncionariosGerenciados +1;
	}
	
	
	public Gerente(int senha) {
		super();
		this.senha = senha;
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}


	public int getNumDeFuncionariosGerenciados() {
		return Gerente.numDeFuncionariosGerenciados;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
	}
	
	
	
	
	
	
}
