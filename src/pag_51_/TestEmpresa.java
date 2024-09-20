package pag_51_;

public class TestEmpresa {

	public static void main(String[] args) {
		
		
		
		Empresa empresaX = new Empresa(10);
	
		
		
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Luna");
		f1.setSalario(0);
		Data data1 = new Data();
		f1.dataEntrada = data1;
		empresaX.adiciona(f1);
		f1.demite();
		
		
		for (int i = 1; i < empresaX.getNumEmpregados(); i++) {
			Funcionario f = new Funcionario();
			f1.setNome("Luna");
			f1.setSalario(1000 + i * 100);
			Data data = new Data();
			f.dataEntrada = data;
			empresaX.adiciona(f);
			
		}

		
//		for (int i = 0; i < empresaX.getNumEmpregados(); i++) {
//			System.out.println(empresaX.getEmpregados(i).getEstaNaEmpresa());
//		}
	
		
		for (Funcionario f : empresaX.getEmpregados()) {
			System.out.println(f.getEstaNaEmpresa());
		}

	}

}
