package ExercíciosLaçosRepetição;

import java.util.Scanner;

public class ExercícioRepetição5 
{
	/*
	 *5- Crie um programa que leia um número do teclado até que encontre um
	 *número igual a zero. No final, mostre a soma dos números
	 *digitados.(DO...WHILE)
	 */
	public static void main(String[] args) 
	{
	   	int numero,soma=0;
	   	
	   	Scanner leia = new Scanner(System.in);
	   	
	   	do
	   	{
	   		System.out.println("\nDigite um número de seu teclado: ");
		   	numero = leia.nextInt();
	   		
		   	soma += numero; 
	   	} 
	   	while(numero != 0);
	   	System.out.println("A soma dos números digitados é: "+soma);
	}

}
