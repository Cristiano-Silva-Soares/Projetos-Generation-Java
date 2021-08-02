package ExercíciosJava;

import java.util.Scanner;

public class Exercício7 
{
	public static void main(String[] args)
	{
		//7. Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
		//valores de X e Y.
		
		int a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um valor para A: ");
		a = leia.nextInt();
		System.out.println("\nDigite um valor para B: ");
		b = leia.nextInt();
		System.out.println("\nDigite um valor para C: ");
		c = leia.nextInt();
		System.out.println("\nDigite um valor para D: ");
		d = leia.nextInt();
		System.out.println("\nDigite um valor para E: ");
		e = leia.nextInt();
		System.out.println("\nDigite um valor para F: ");
		f = leia.nextInt();
		
			x = (c * e) - (b * f) / (a * e) - (b * d);
			y = (a * f) - (c * d) / (a * e) - (c * d);
			
		System.out.println("\nO valor de X é: "+x);
		System.out.println("\nO valor de Y é: "+y);	
	}

}
