package exception;

import java.util.Scanner;

public class Assertions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entre um n�mero de 0 e 10");
		int numero = s.nextInt();
		
		assert(numero >=0 && numero <=10) : "N�mero invalido " + numero;
		System.out.println("Voce entrou " + numero);
				
	}
}
