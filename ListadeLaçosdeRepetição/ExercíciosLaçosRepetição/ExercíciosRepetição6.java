package Exerc�ciosLa�osRepeti��o;

import java.util.Scanner;

public class Exerc�ciosRepeti��o6 
{
	/*
	 *6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	 *final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	 *0(zero).(DO...WHILE)
	 */
	public static void main(String[] args) 
	{
		double num,media,soma=0,outroNUM=3;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("Entre com um n�mero do seu teclado: ");
			num = leia.nextInt();
			
			if(num % 3 == 0);
			{
				outroNUM++;
				soma += outroNUM;	
			}
		}
		while(num != 0);
		
			if(outroNUM != 0);
			{
				media = soma / outroNUM;
				System.out.printf("\nA m�dia dos n�meros multiplos de 3 digitados �: %.2f ",media);
			}
	}

}
