package POO;

import java.util.Scanner;

public class testeTrabalhador {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		Trabalhador ficha = new Trabalhador();
		
		System.out.println("\nEntre com seu nome: ");
		ficha.setNome(leia.next());
		
		System.out.printf("\nEntre com o seu sal�rio: ");
		ficha.setSalario(leia.nextDouble());
		
		System.out.print("\nEntre com seus anos de servi�o: ");
		ficha.setAnosTrabalho(leia.nextInt());
		
		ficha.defineSalario();
		
		ficha.imprime();

	}

}
