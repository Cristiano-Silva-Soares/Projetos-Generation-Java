package Exerc�ciosLa�osRepeti��o;

import java.util.Scanner;

public class Exerc�cioRepeti��o3 
{
	/*
	 *3- Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
	 *21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	 *idade for =-99. (WHILE)
	 */
	public static void main(String[] args)
	{
		int idade,x=0,y=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			
			if (idade <= 21)
			{
				
			}
			else if (idade >= 50)
			{
				
			}
			else
			{
				System.out.println("\nSua idade n�o ser� imprimida na contagem final...");
			}
		}		
				System.out.println("\nN�mero de pessoas dentro do escopo de 21 anos: "+x);
				System.out.println("\nN�mero de pessoas dentro do escopo de 50 anos ou mais: "+y);
	}
}
