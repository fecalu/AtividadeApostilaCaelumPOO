package pag_56_ex1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Pessoa joao = new Pessoa();
		
		Data dataJoao = new Data(15,12,1996);
		
		
		joao.data = dataJoao;
		
		
		Data dataAtual = new Data(31,8,2024);

		
		joao.dataAtual = dataAtual;
		
		
		System.out.println(joao.data);
		System.out.println(joao.idade());
		
		System.out.println("...");
		
		joao.fazAniversario();
		
		System.out.println(joao.idade);
		
		
		
		
		
		
		
		sc.close();
		

	}

}
