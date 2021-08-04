package ExercíciosLaçosCondicionais;

import java.util.*;

public class LacosCondicionais4 
{

	public static void main(String[] args) 
	{
		double x,par,impar;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\nEntre com um número: ");
		x = leia.nextInt();
		
			if (x % 2 == 0)
			{
				par = Math.sqrt(x);
				System.out.printf("\nO número: %.0f , é par, e a sua raiz é : %.2f",x,par);
			}
			else
			{
				impar = Math.pow(x,2);
				System.out.printf("\nO número: %.0f, é ímpar, se o elevarmos ao cubo seu resultado será %.2f",x,impar);
			}
	}

}
