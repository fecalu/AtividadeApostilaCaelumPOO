package pag_93_;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	
	private int horaDeAula;
	
	
	
	@Override
	public double getGastos() {
		return this.getSalario() + this.horaDeAula * 10;
	}
	
	@Override
	public String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + "hora de aula" + this.horaDeAula;
		return informacao;
	}
	
}
