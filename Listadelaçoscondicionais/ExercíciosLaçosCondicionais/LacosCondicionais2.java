package ExercíciosLaçosCondicionais;

import java.util.Scanner;

public class LacosCondicionais2 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o número de A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o número de B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o número de C: ");
		c = leia.nextInt();
		
		if(a <= b && c > a)
		{
			System.out.println("\nA ordem crescente dos números digitados é: "+a+b+c);
		}
		else if(b <= a && c > a)
		{
			System.out.println("\nA ordem crescente dos números digitados é: "+b+a+c);
		}
		else if(c <= a && b > a)
		{
			System.out.println("\nA ordem crescente dos números digitados é: "+c+a+b);
		}
		else if (a <= b && c > b)
		{
			System.out.println("\nA ordem crescente dos números digitados é: "+a+c+b);
		}
		else if (b <= c && a > c)
		{
			System.out.println("\nA ordem crescente dos números digitados é: "+b+c+a);
		}
		else
		{
			System.out.println("\nA ordem crescente dos números digitados é: "+c+b+a);
		}

	}

}
