package pag_51_;

public class PessoaFisica {
	
	private String cpf;
	
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean validaCpf(String cpf) {
		cpf = cpf.replaceAll("\\D", "");
		if (cpf.length() != 11) {
			return false;
		} else {
			return true;
		}
	}
	
}
