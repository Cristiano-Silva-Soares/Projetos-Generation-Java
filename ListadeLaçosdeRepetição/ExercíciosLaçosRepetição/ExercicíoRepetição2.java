package ExercíciosLaçosRepetição;

public class ExercicíoRepetição2 
{
	/*
	 *2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	 */
	public static void main(String[] args)
	{
		int numero,x=1;
		
		for(numero=1;numero<=10;numero++)
		{
			if(numero % 2 ==0)
			{
				System.out.println("\nPar: "+numero);
			}
			else
			{
				System.out.println("\nÍmpar: "+numero);
			}
			
		}
	}

}
