package ExercíciosArrays;
/*
*  2- Faça um programa que receba 6 números inteiros e mostre: 
*	• Os números pares digitados;  
*	• A soma dos números pares digitados; 
*	• Os números ímpares digitados; 
*	• A quantidade de números ímpares digitados.

 */
import java.util.Scanner;

public class Exercício2 
{

	public static void main(String[] args) 
	{
		int[] numero = new int[6];
		int contpar=0, somapar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x=0;x<6;x++)
		{
			System.out.println("\nEntre com um número: ");
			numero[x] = leia.nextInt();
			
			if (numero[x] % 2 == 0)
			{
				contpar++;
				somapar+=numero[x];
				System.out.println("\nEste é par. ");
			}
			else
			{
				contimpar++;
				System.out.println("\nEste é ímpar. ");
			}
		}
			System.out.println("\nNumeros ímpares digitados: "+contimpar);
			System.out.println("\nNumeros pares digitados: "+contpar);
			System.out.println("\nSoma dos pares digitados: "+somapar);
	}
			
}
			


