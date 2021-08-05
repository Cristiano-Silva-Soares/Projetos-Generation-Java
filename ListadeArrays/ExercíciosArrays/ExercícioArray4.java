package Exerc�ciosArrays;

import java.util.Scanner;

/*
 * 4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
 *(1) somar as duas matrizes 
 *(2) subtrair a primeira matriz da segunda 
 *(3) adicionar uma constante as duas matrizes
 *(4) imprimir as matrizes 
 *Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
 *Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
 */

public class Exerc�cioArray4 
{
	public static void main(String[] args)
	{
		double[][] matriz1 = new double [2][2];
		double[][] matriz2 = new double [2][2];
		double[][] matriz3 = new double [2][2];
		
		double soma,subtracao;
		int num,cons;
		
		Scanner leia = new Scanner(System.in);
		
		for (int linha=0;linha<2;linha++)
		{
			for (int coluna=0;coluna<2;coluna++)
			{
				System.out.printf("\nEntre com um n�mero para a matriz 1: ");
				matriz1[linha][coluna] = leia.nextFloat();
				System.out.printf("\nEntre com um n�mero para a matriz 2: ");
				matriz2[linha][coluna] = leia.nextFloat();
			}
		}
		do 
		{
			System.out.println("\nDigite (1) para somar as duas matrizes.");
			System.out.println("\nDigite (2) para subtrair a primeira matriz da segunda.");
			System.out.println("\nDigite (3) para adicionar uma constante para as duas matrizes.");
			System.out.println("\nDigite (4) para imprimir as matrizes.");
			System.out.println("\nDigite (0) para finalizar a sua opera��o.");
			System.out.println("\nEscolha a sua op��o: ");
			num = leia.nextInt();
			
			switch(num)
			{
			case 1:
				for (int linha=0;linha<2;linha++)
				{
					for (int coluna=0;coluna<2;coluna++)
					{
						soma = matriz1[linha][coluna] + matriz2[linha][coluna];
						System.out.printf("\nO resultado da soma das duas matrizes: %f ",soma);	
					}
				}
				break;
			case 2:
				for (int linha=0;linha<2;linha++)
				{
					for (int coluna=0;coluna<2;coluna++)
					{
						subtracao = matriz2[linha][coluna] - matriz1[linha][coluna];
						System.out.printf("\nO resultado da subtra��o das duas matrizes: %f ",subtracao);	
					}
				}
				break;
			case 3:
				System.out.println("\nEntre com o n�mero da sua constante: ");
				 cons = leia.nextInt();
				
				for (int linha=0;linha<2;linha++)
				{
					for (int coluna=0;coluna<2;coluna++)
					{
						matriz1[linha][coluna]= matriz1[linha][coluna] + cons;
						matriz2[linha][coluna]= matriz2[linha][coluna] + cons;
						
						System.out.printf("\nMatriz1 com a constante adicionada: %f",matriz1[linha][coluna]);
						System.out.printf("\nMatriz2 com a constante adicionada: %f",matriz2[linha][coluna]);
					}
				}	
				break;
			case 4:
				for (int linha=0;linha<2;linha++)
				{
					for (int coluna=0;coluna<2;coluna++)
					{
						System.out.printf("\n%f",matriz1[linha][coluna]);
						System.out.printf("\n%f",matriz2[linha][coluna]);
					}
				}
				break;
					default:
						System.out.println("\nA op��o digitada n�o condiz com a opera��o,perd�o...");
			}
		}
		while(num!=0);	
	}
}

	

	
		
		
		


