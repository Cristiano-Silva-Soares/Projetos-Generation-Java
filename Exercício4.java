package ExercíciosJava;

import java.util.Scanner;

public class Exercício4 
{

	public static void main(String[] args) 
	{
		//4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		// calcule-os.
		
		double a,b,c,r,s,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		c = leia.nextInt();
		
			r = Math.pow(a + b,2);
			s = Math.pow(c + b,2);
			d = (r + s) / 2;
		
		System.out.println("\nO valor de R, imposto por seu respectivo calculo representa: "+r);
		System.out.println("\nO valor de S, imposto por seu respectivo calculo representa: "+s);
		System.out.println("\nO valor de D, imposto por seu respectivo calculo representa: "+d);
	}

}
