package Exerc�ciosJava;

import java.util.Scanner;

public class Exerc�cio2 
{

	public static void main(String[] args) 
	{
		//2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		//expressa em anos, meses e dias.
		
		int dias,anos,meses,totaldias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o seu total de dias v�vidos: ");
		totaldias = leia.nextInt();
		
			anos = totaldias / 365;
			meses = (totaldias % 365) / 30;
			dias = (totaldias % 365) % 30;
		
		System.out.println("\nVoc� viveu, "+anos+" anos, "+meses+" meses e, "+dias+" dias.");
	}

}
