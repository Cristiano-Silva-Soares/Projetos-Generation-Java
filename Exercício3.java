package Exerc�ciosJava;

import java.util.Scanner;

public class Exerc�cio3 {

		public static void main(String[] args)
		{
			//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
			//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
			
			int tempoduracao,horas,minutos,segundos;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite o tempo de dura��o do vento em segundos: ");
			tempoduracao = leia.nextInt();
			
				horas = tempoduracao / 3600;
				minutos = (tempoduracao % 3600) / 60;
				segundos = (tempoduracao % 3600) % 60;
			
			System.out.println("\nO evento durou "+horas+" horas, "+minutos+" minutos, "+segundos+" segundos.");
		}
}
