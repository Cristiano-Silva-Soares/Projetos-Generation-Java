package ExercíciosLaçosRepetição;

import java.util.Scanner;

public class ExercíciosRepetição6 
{
	/*
	 *6- Escrever um programa que receba vários números inteiros no teclado. E no
	 *final imprimir a média dos números múltiplos de 3. Para sair digitar
	 *0(zero).(DO...WHILE)
	 */
	public static void main(String[] args) 
	{
		double num,media,soma=0,outroNUM=3;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("Entre com um número do seu teclado: ");
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
				System.out.printf("\nA média dos números multiplos de 3 digitados é: %.2f ",media);
			}
	}

}
