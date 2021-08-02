package ExercíciosJava;

import java.util.Scanner;

public class Exercício3 {

		public static void main(String[] args)
		{
			//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
			//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
			
			int tempoduracao,horas,minutos,segundos;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite o tempo de duração do vento em segundos: ");
			tempoduracao = leia.nextInt();
			
				horas = tempoduracao / 3600;
				minutos = (tempoduracao % 3600) / 60;
				segundos = (tempoduracao % 3600) % 60;
			
			System.out.println("\nO evento durou "+horas+" horas, "+minutos+" minutos, "+segundos+" segundos.");
		}
}
