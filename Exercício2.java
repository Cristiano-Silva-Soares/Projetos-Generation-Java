package ExercíciosJava;

import java.util.Scanner;

public class Exercício2 
{

	public static void main(String[] args) 
	{
		//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		//expressa em anos, meses e dias.
		
		int dias,anos,meses,totaldias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o seu total de dias vívidos: ");
		totaldias = leia.nextInt();
		
			anos = totaldias / 365;
			meses = (totaldias % 365) / 30;
			dias = (totaldias % 365) % 30;
		
		System.out.println("\nVocê viveu, "+anos+" anos, "+meses+" meses e, "+dias+" dias.");
	}

}
