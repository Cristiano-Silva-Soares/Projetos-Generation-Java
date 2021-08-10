package POO;

public class cachorro extends animais
{
	private int dentes;
	
	public cachorro (String nome,String especie,String classe,String alimentacao,int dentes)
	{
		super (nome,especie,classe,alimentacao);
		this.dentes = dentes;
	}

	public int getDentes() {
		return dentes;
	}

	public void setDentes(int dentes) {
		this.dentes = dentes;
	}
	
	public void imprime1()
	{
		System.out.println("O cachorro "+getNome()+" é da especie "+getEspecie()+" ,classe "+getClasse()+" ,se alimenta de "+getAlimentacao()+" e tem "+getDentes()+" dentes.");
	}
}
