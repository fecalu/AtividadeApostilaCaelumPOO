package pag_36_;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
		
		
		Conta contaGeo = new Conta();
		
		contaGeo.dono = "Geovana";
		contaGeo.saldo = 1000.0;
		
		minhaConta.transfere(contaGeo, 150);
		
		
		
	System.out.println(minhaConta.saldo);
	System.out.println(contaGeo.saldo);
		
		
		
		
		sc.close();
		
	}

}
