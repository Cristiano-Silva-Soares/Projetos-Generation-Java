package Exerc�ciosLa�osRepeti��o;

public class Exercic�oRepeti��o2 
{
	/*
	 *2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
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
				System.out.println("\n�mpar: "+numero);
			}
			
		}
	}

}
