package Exerc�ciosJava;

import java.util.Scanner;

public class Exerc�cio1 
{

	public static void main(String[] args) 
	{
		//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
		//dias e mostre-a expressa apenas em dias.
		
		int anos,meses,dias,diasvividos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade: ");
		anos = leia.nextInt();
		System.out.println("\nEntre com os meses: ");
		meses = leia.nextInt();
		System.out.println("\nEntre com os seus dias: ");
		dias = leia.nextInt();
		
			anos = 365 * anos;
			meses = 30 * meses;
			diasvividos = anos + meses + dias;
				
		System.out.println("Total de dias vividos: "+diasvividos);
	}

}
