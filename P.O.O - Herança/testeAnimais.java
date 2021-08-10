package POO;

public class testeAnimais {

	public static void main(String[] args) 
	{
		cachorro pitbull = new cachorro("Pablito","Canis familiaris","Mamífero","Pedigree",42);
		System.out.println("\t");
		pitbull.imprime1();
		System.out.println("\t");
		cavalo ponei = new cavalo("Akira","Equus ferus","Mamífero","Maçã",1);
		System.out.println("\t");
		ponei.imprime2();
		System.out.println("\t");
		preguica preguicaBentinho = new preguica("King","Bradypus tridactylus","Mamífero","Folhas",45);
		System.out.println("\t");
		preguicaBentinho.imprime3();
		System.out.println("\t");
	}

}
