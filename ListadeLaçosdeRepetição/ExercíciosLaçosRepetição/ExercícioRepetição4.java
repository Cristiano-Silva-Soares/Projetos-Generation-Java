package Exerc�ciosLa�osRepeti��o;

import java.util.Scanner;

public class Exerc�cioRepeti��o4 
{
	/*
	 *4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
	 *psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
	 *era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
	 *(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	 *agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	 *pessoas, calcule e mostre: (WHILE)
	 *o n�mero de pessoas calmas;x
	 *o n�mero de mulheres nervosas;x
	 *o n�mero de homens agressivos;x
	 *o n�mero de outros calmos;x
	 *o n�mero de pessoas nervosas com mais de 40 anos;
	 *o n�mero de pessoas calmas com menos de 18 anos.
	 */
	

	public static void main(String[] args) 
	{
		int idade,sexo,estado,pessoas=1,calmas=0,nervosas=0,agressivas=0,calmes=0,nervo40=0,calmo18=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nN�meros correspondentes ao seu sexo - 1: Feminino; 2: Masculino; 3: Outres");
		System.out.println("\nN�meros correspondentes ao seu estado - 1: Calme; 2: Nervose; 3: Agressive");
		
		while(pessoas <= 6)
		{
			pessoas++;
			
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("Digite um n�mero correspondente ao seu Gen�ro: ");
			sexo = leia.nextInt();
			System.out.println("Digite um n�mero correspondente ao seu estado psicol�gico: ");
			estado = leia.nextInt();
			
			if(estado == 1)
			{
				calmas++;
				
			}
			if(sexo == 1 && estado == 2)
			{
				nervosas++;
				
			}
			if (sexo == 2 && estado == 3)
			{
				agressivas++;
				
			}
			if(sexo == 3 && estado == 1)
			{
				calmes++;
				
			}
			if(idade >=40 && estado == 2)
			{
				nervo40++;
				
			}
			if(idade <= 18 && estado == 1)
			{
				calmo18++;
				
			}
			
		}
		System.out.println("\nO n�mero de pessoas calmes �: "+calmas);
		System.out.println("\nO n�mero de mulheres nervosas �: "+nervosas);
		System.out.println("\nO n�mero de homens agressivos �: "+agressivas);
		System.out.println("\nO n�mero de outres calmes �: "+calmes);
		System.out.println("\nO n�mero de pessoas com, ou mais de 40 anos, que s�o nervoses �: "+nervo40);
		System.out.println("\nO n�mero de pessoas com, ou menos de 18 anos, que s�o calmes �: "+calmo18);
	}

}
