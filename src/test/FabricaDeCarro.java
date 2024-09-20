package test;

class FabricaDeCarro {

	private static FabricaDeCarro instanciaUnica;

	private FabricaDeCarro() {

	}

	public static FabricaDeCarro getInstancia() {
		if (instanciaUnica == null) {
			instanciaUnica = new FabricaDeCarro();
		}
		return instanciaUnica;
	}

	public void fabricarCarro() {
		System.out.println("Carro fabricado!");
	}
}
