package test;

public class Teste {
    public static void main(String[] args) {

        FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
        

        fabrica.fabricarCarro();
        
        int testegit = 10;
        
        FabricaDeCarro outraFabrica = FabricaDeCarro.getInstancia();
        
        
        if (fabrica == outraFabrica) {
            System.out.println("Mesma instância");
        }
    }
}