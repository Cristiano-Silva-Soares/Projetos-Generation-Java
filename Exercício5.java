package Exerc�ciosJava;

import java.util.Scanner;

public class Exerc�cio5 
{

	public static void main(String[] args) 
	{
		//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
		//respectivamente.
		
		double n1,n2,n3,mediap;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a sua primeira nota: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite a sua segunda nota: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite a sua terceira nota: ");
		n3 = leia.nextInt();
		
			mediap = (n1 * 2) + (n2 * 3) + (n3 * 4) / (2 + 3 + 4);
			
		System.out.println("\nO valor da sua m�dia ponderada �: "+mediap);	
	}

}
