package Exerc�ciosLa�osRepeti��o;

import java.util.Scanner;

public class Exerc�cioRepeti��o5 
{
	/*
	 *5- Crie um programa que leia um n�mero do teclado at� que encontre um
	 *n�mero igual a zero. No final, mostre a soma dos n�meros
	 *digitados.(DO...WHILE)
	 */
	public static void main(String[] args) 
	{
	   	int numero,soma=0;
	   	
	   	Scanner leia = new Scanner(System.in);
	   	
	   	do
	   	{
	   		System.out.println("\nDigite um n�mero de seu teclado: ");
		   	numero = leia.nextInt();
	   		
		   	soma += numero; 
	   	} 
	   	while(numero != 0);
	   	System.out.println("A soma dos n�meros digitados �: "+soma);
	}

}
