package Exerc�ciosLa�osRepeti��o;

/*
 *1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
 *obtemos resto = 5. (FOR)
 */
public class Exerc�cioRepeti��o 
{

	public static void main(String[] args) 
	{
		double numero;
		
		for(numero=1000;numero<=1999;numero++)
		{
			if(numero % 11 == 5)
			{
				System.out.printf("\nOs n�meros contabilizados de 1000 a 1999 que tem resto de divis�o igual a 5: %.2f .",numero);
			}
		}
	}

}
