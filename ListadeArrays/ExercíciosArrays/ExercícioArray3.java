package ExercíciosArrays;

import java.util.Scanner;

/*
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

public class ExercícioArray 
{
	public static void main(String[] args)
	{
		int[][] numero = new int [3][3];
		int conta10 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int coluna=0;coluna<3;coluna++)
		{
			for (int linha=0;linha<3;linha++)
			{
				System.out.println("\nEntre com um número: ");
				numero[linha][coluna] = leia.nextInt();
				
				if (numero[linha][coluna] > 10)
				{
					conta10++;
					System.out.println("\nÉ maior que 10...");
				}
			}
		}
				System.out.println("\nNumeros digitados que são maiores que 10: "+conta10);
	}
}
