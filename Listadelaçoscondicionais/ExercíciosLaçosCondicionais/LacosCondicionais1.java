package ExercíciosLaçosCondicionais;

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
		System.out.println("\nDigite um número para C: ");
		c = leia.nextInt();
		
			if (a > b && a > c)
			{
				System.out.println("\nO número inserido na variável A: "+a+" é maior que B: "+b+" e C: "+c);
			}
			else if  (b > a && b > c)
			{
				System.out.println("\nO número inserido na variável B: "+b+" é maior que A: "+a+" e C: "+c);
			}
			else
			{
				System.out.println("\nO número inserido na variável C: "+c+" é maior que A: "+a+" e B: "+b);
			}
	}

}
