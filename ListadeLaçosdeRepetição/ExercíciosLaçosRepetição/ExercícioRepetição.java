package ExercíciosLaçosRepetição;

/*
 *1- Informar todos os números de 1000 a 1999 que quando divididos por 11
 *obtemos resto = 5. (FOR)
 */
public class ExercícioRepetição 
{

	public static void main(String[] args) 
	{
		double numero;
		
		for(numero=1000;numero<=1999;numero++)
		{
			if(numero % 11 == 5)
			{
				System.out.printf("\nOs números contabilizados de 1000 a 1999 que tem resto de divisão igual a 5: %.2f .",numero);
			}
		}
	}

}
