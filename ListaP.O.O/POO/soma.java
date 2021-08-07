package POO;

public class soma 
{
	private int numeroUm;
	private int numeroDois;
	
	public soma (int numerox, int numeroy)
	{
		numeroUm = numerox;
		numeroDois = numeroy;
	}
	public int getprimeiroNumero()
	{
		int primeiroNumero = numeroUm;
		return primeiroNumero;
	}
	public int getsegundoNumero()
	{
		int segundoNumero = numeroDois;
		return segundoNumero;
	}
	public int  getsomaNumeros()
	{
		int somaNumeros = numeroUm + numeroDois;
		return somaNumeros;
	}
}
