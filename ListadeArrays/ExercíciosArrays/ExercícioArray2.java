package Exerc�ciosArrays;
/*
*  2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
*	� Os n�meros pares digitados;  
*	� A soma dos n�meros pares digitados; 
*	� Os n�meros �mpares digitados; 
*	� A quantidade de n�meros �mpares digitados.

 */
import java.util.Scanner;

public class Exerc�cio2 
{

	public static void main(String[] args) 
	{
		int[] numero = new int[6];
		int contpar=0, somapar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x=0;x<6;x++)
		{
			System.out.println("\nEntre com um n�mero: ");
			numero[x] = leia.nextInt();
			
			if (numero[x] % 2 == 0)
			{
				contpar++;
				somapar+=numero[x];
				System.out.println("\nEste � par. ");
			}
			else
			{
				contimpar++;
				System.out.println("\nEste � �mpar. ");
			}
		}
			System.out.println("\nNumeros �mpares digitados: "+contimpar);
			System.out.println("\nNumeros pares digitados: "+contpar);
			System.out.println("\nSoma dos pares digitados: "+somapar);
	}
			
}
			


