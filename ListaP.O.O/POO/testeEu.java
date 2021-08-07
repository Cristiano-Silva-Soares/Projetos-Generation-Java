package POO;

public class testeEu 
{

	public static void main(String[] args) 
	{
	  eu informacoes = new eu("Cristiano","Masculino",22,1.81);
	  
	  System.out.println(informacoes.getseuNome());
	  
	  System.out.println(informacoes.getseuGenero());
	  
	  System.out.println(informacoes.getaIdade());
	  
	  System.out.println(informacoes.getaAltura());
	}

}
