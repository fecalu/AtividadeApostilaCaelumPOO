package pag_51_;

public class Programa {

	public static void main(String[] args) {
		

		
		Gerente g1 = new Gerente();
		g1.setSalario(1000);;
		g1.getBonificacao();
		
		Funcionario f2 = g1;
		
	
	
		
		System.out.println(f2.getBonificacao());
		System.out.println(g1.getBonificacao());

	}

}
