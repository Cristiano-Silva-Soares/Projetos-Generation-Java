package Exerc�ciosJava;

import java.util.Scanner;

public class Exerc�cio8 
{

	public static void main(String[] args) 
	{
		//8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		//percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		//consumidor.
		
		double custof,custoc;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o custo de f�brica do carro que deseja: ");
		custof = leia.nextInt();
		
			custoc = custof + (0.28 + 0.45) * custof;
		
		System.out.println("\nSeu custo como consumidor ser�: "+custoc);
	}

}
