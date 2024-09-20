package pag_51_;

public class Empresa {
		
	private String none;
	private int cnpj;
	private Funcionario[] empregados;
	
	
	 public Empresa(int tamanho) {
	        this.empregados = new Funcionario[tamanho];
	    }
	
	
	public String getNome() {
		return this.none;
	}
	
	public void setNome(String nome) {
		this.none = nome;
	}
	
	public int getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public Funcionario getEmpregados(int posicao) {
		return this.empregados[posicao];
	}
	
	
	public int getNumEmpregados() {
		return this.empregados.length;
	}
	
	// Getter para o array de funcionários
    public Funcionario[] getEmpregados() {
        return this.empregados;
    }

	public int posicao = 0;
	public void adiciona(Funcionario f) {
		if (posicao < this.empregados.length) {
			this.empregados[posicao] = f;
			posicao++;
		}  else {
			System.out.println("Não há espaço para adicionar mais funcionários.");
		}
		
	}
	
	
	public boolean estaNaEmpresa(Funcionario f) {
		if (f.getEstaNaEmpresa()) {
			return true;
		}
		return false;
	}
	
	
}
