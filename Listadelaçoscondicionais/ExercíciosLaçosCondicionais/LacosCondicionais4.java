package Exerc�ciosLa�osCondicionais;

import java.util.*;

public class LacosCondicionais4 
{

	public static void main(String[] args) 
	{
		double x,par,impar;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\nEntre com um n�mero: ");
		x = leia.nextInt();
		
			if (x % 2 == 0)
			{
				par = Math.sqrt(x);
				System.out.printf("\nO n�mero: %.0f , � par, e a sua raiz � : %.2f",x,par);
			}
			else
			{
				impar = Math.pow(x,2);
				System.out.printf("\nO n�mero: %.0f, � �mpar, se o elevarmos ao cubo seu resultado ser� %.2f",x,impar);
			}
	}

}
