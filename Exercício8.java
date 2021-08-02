package ExercíciosJava;

import java.util.Scanner;

public class Exercício8 
{

	public static void main(String[] args) 
	{
		//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		//consumidor.
		
		double custof,custoc;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o custo de fábrica do carro que deseja: ");
		custof = leia.nextInt();
		
			custoc = custof + (0.28 + 0.45) * custof;
		
		System.out.println("\nSeu custo como consumidor será: "+custoc);
	}

}
