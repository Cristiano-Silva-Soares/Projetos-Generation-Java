package ExercíciosJava;

import java.util.Scanner;

public class Exercício6 
{
	public static void main(String[] arg)
	{
		//6. Construa um programa em c que, tendo como dados de entrada dois pontos
		//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
		
		double x1,x2,y1,y2,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro valor de X: ");
		x1 = leia.nextInt();
		System.out.println("\nDigite o segundo valor de X: ");
		x2 = leia.nextInt();
		System.out.println("\nDigite o primeiro valor de Y: ");
		y1 = leia.nextInt();
		System.out.println("\nDigite o segundo valor de Y: ");
		y2 = leia.nextInt();
		
			d = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
		
		System.out.println("\nA distância entre P(X1,X2) e P(Y1,Y2) se dá por: "+d);	
	}

}
