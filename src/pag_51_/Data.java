package pag_51_;

public class Data {
	public int dia = 0;
	public int mes = 0;
	public int ano = 0;
	
	
	public String formatada() {
		return "" + this.dia + "/" + this.mes + "/" + this.ano;
	}
	
	public String toString() {
		return " " + this.dia + this.mes + this.ano;
	}
}
