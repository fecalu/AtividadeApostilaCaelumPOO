package pag_51_;

abstract public class Funcionario {
	
	protected static int identificador;
	protected String nome;
	protected String departamento;
	protected double salario;
	protected Data dataEntrada;
	protected boolean estaNaEmpresa = true;
	
	
	public Funcionario() {
		Funcionario.identificador = Funcionario.identificador + 1;
	}
	
	public Funcionario (String nome, String departamento, double salario){
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		Funcionario.identificador = Funcionario.identificador + 1;
	}
	
	
	public int getIdentificador() {
		return Funcionario.identificador;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean getEstaNaEmpresa() {
		return this.estaNaEmpresa;
	}
	
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	
	
	
	
	public void recebeAumento(double valor) {
		this.salario += valor;
	}
	
	public double calculaGanhoAnual() {
		return this.salario * 12;
	}

	public boolean demite() {
		return this.estaNaEmpresa = false;
	}
	
	
	
	public String toString() {
		return  this.nome +"\n" +
				this.departamento +"\n" +
				this.salario +"\n" +
				this.dataEntrada.formatada() +"\n" +
				this.estaNaEmpresa;
		
	}
	
	abstract public double getBonificacao(); 
		
	
}
