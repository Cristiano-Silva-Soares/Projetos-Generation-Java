package Exerc�ciosLa�osCondicionais;

import java.util.*;

public class LacosCondicionais1 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nDigite um valor para B: ");
		b = leia.nextInt();
		System.out.println("\nDigite um n�mero para C: ");
		c = leia.nextInt();
		
			if (a > b && a > c)
			{
				System.out.println("\nO n�mero inserido na vari�vel A: "+a+" � maior que B: "+b+" e C: "+c);
			}
			else if  (b > a && b > c)
			{
				System.out.println("\nO n�mero inserido na vari�vel B: "+b+" � maior que A: "+a+" e C: "+c);
			}
			else
			{
				System.out.println("\nO n�mero inserido na vari�vel C: "+c+" � maior que A: "+a+" e B: "+b);
			}
	}

}
