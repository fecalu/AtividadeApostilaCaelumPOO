package pag_56_ex1;

public class Pessoa {
	
	public String nome;
	public int idade;
	public Data data;
	public Data dataAtual;
	
	
	public int idade() {
		
		if (data.mes == dataAtual.mes) {
			
			int idade = (2024 - data.ano);
			
			this.idade = idade;
			
			return this.idade;
			 
		}
		else {
			int idade = ((2024 - data.ano) - 1);
			this.idade = idade;
			return this.idade;
		}
			
				
	}
	
	public void fazAniversario() {
		
		this.idade = this.idade + 1;
		
		
		
	}

}
