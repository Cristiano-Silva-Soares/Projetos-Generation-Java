package POO;

public class cavalo extends animais
{
	private int dedosnaspatas;
	
	public cavalo (String nome,String especie,String classe,String alimentacao,int dedosnaspatas)
	{
		super(nome,especie,classe,alimentacao);
		this.dedosnaspatas = dedosnaspatas;
	}
	public int getDedosnaspatas() 
	{
		return dedosnaspatas;
	}
	public void setDedosnaspatas(int dedosnaspatas) 
	{
		this.dedosnaspatas = dedosnaspatas;
	}
	public void imprime2()
	{
		System.out.println("O cavalo "+getNome()+" é da especie "+getEspecie()+" ,classe "+getClasse()+" ,se alimenta de "+getAlimentacao()+" e tem "+getDedosnaspatas()+" dedo por casco.");
	}
}
