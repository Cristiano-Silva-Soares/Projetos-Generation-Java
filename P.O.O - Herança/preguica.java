package POO;

public class preguica extends animais 
{
private int idade;
	
	public preguica (String nome,String especie,String classe,String alimentacao,int idade)
	{
		super(nome,especie,classe,alimentacao);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void imprime3()
	{
		System.out.println("O cavalo "+getNome()+" é da especie "+getEspecie()+" ,classe "+getClasse()+" ,se alimenta de "+getAlimentacao()+" e tem "+getIdade()+" anos de vida.");
	}
	
}
