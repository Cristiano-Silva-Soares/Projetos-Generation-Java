package POO;

public class testeFilme 
{
	public static void main(String[] args)
	{
		filme cinema = new filme ("William Friedkin","O exorcista",1973);
		
		System.out.println(cinema.getnomeDoDiretor());
		
		System.out.println(cinema.getnomeDoDilme());
		
		System.out.print(cinema.getanoDeLancamento());
	}
}
