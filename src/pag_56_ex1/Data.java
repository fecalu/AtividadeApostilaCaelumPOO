package pag_56_ex1;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	  public Data(int dia, int mes, int ano) {
	        this.dia = dia;
	        this.mes = mes;
	        this.ano = ano;
	    }
	
	
	public String toString() {
		return "" + this.dia + "/" + this.mes + "/" + this.ano;
	}

}
