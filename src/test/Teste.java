package test;

public class Teste {
    public static void main(String[] args) {
        // Obter a instância única da fábrica
        FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
        
        // Usar a fábrica
        fabrica.fabricarCarro();
        
        // Tentar obter outra instância, mas será a mesma
        FabricaDeCarro outraFabrica = FabricaDeCarro.getInstancia();
        
        // Comparar as duas referências
        if (fabrica == outraFabrica) {
            System.out.println("Mesma instância");
        }
    }
}