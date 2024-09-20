package pag_56_ex2;

public class Porta {
	
	public boolean aberta;
	public String cor;
	public double dimensaoX;
	public double dimensaoY;
	public double dimensaoZ;
	
	
	public void abrePorta() {
		this.aberta = false;
	}
	
	public void fechaPorta() {
		this.aberta = true;
	}

	public void pinta(String cor) {
		this.cor = cor;
	}
	

}
