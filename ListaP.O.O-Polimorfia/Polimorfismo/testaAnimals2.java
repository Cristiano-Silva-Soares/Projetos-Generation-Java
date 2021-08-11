package P.o.o.Polimorfismo;

public class testaAnimals2 
{
	public static void main(String[] args)
	{
		cachorro1 pitbull = new cachorro1(69);
		cavalo1 ponei = new cavalo1(70);
		preguica1  bentinho = new preguica1(4);
		
		pitbull.nome();
		pitbull.idade();
		System.out.println(" ");
		pitbull.emitesom();
		pitbull.imprime1();
		
		System.out.println("*******************************************************************************************");
		
		ponei.nome();
		ponei.idade();
		System.out.println(" ");
		ponei.emitesom();
		ponei.imprime2();
		
		System.out.println("*******************************************************************************************");
		
		bentinho.nome();
		bentinho.idade();
		bentinho.emitesom();
		bentinho.imprime3();
	}
}
