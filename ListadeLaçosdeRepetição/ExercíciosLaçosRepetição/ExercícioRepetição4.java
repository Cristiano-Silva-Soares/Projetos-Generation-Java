package ExercíciosLaçosRepetição;

import java.util.Scanner;

public class ExercícioRepetição4 
{
	/*
	 *4- Uma empresa desenvolveu uma pesquisa para saber as características
	 *psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	 *era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	 *(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	 *agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	 *pessoas, calcule e mostre: (WHILE)
	 *o número de pessoas calmas;x
	 *o número de mulheres nervosas;x
	 *o número de homens agressivos;x
	 *o número de outros calmos;x
	 *o número de pessoas nervosas com mais de 40 anos;
	 *o número de pessoas calmas com menos de 18 anos.
	 */
	

	public static void main(String[] args) 
	{
		int idade,sexo,estado,pessoas=1,calmas=0,nervosas=0,agressivas=0,calmes=0,nervo40=0,calmo18=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNúmeros correspondentes ao seu sexo - 1: Feminino; 2: Masculino; 3: Outres");
		System.out.println("\nNúmeros correspondentes ao seu estado - 1: Calme; 2: Nervose; 3: Agressive");
		
		while(pessoas <= 6)
		{
			pessoas++;
			
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("Digite um número correspondente ao seu Genêro: ");
			sexo = leia.nextInt();
			System.out.println("Digite um número correspondente ao seu estado psicológico: ");
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
		System.out.println("\nO número de pessoas calmes é: "+calmas);
		System.out.println("\nO número de mulheres nervosas é: "+nervosas);
		System.out.println("\nO número de homens agressivos é: "+agressivas);
		System.out.println("\nO número de outres calmes é: "+calmes);
		System.out.println("\nO número de pessoas com, ou mais de 40 anos, que são nervoses é: "+nervo40);
		System.out.println("\nO número de pessoas com, ou menos de 18 anos, que são calmes é: "+calmo18);
	}

}
