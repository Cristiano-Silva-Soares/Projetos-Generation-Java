package POO;

public class eu 
{
	private String meuNome;
	private String meuGenero;
	private int minhaIdade;
	private double minhaAltura;
	
	public eu(String nome,String genero,int idade,double d)
	{
	this.meuNome = nome;
	this.meuGenero = genero;
	this.minhaIdade = idade;
	this.minhaAltura = d;
	}
	public String getseuNome()
	{
		String seuNome = meuNome;
		return seuNome;
	}
	public String getseuGenero()
	{
		String seuGenero = meuGenero;
		return seuGenero;
	}
	public int getaIdade()
	{
		int aIdade = minhaIdade;
		return aIdade;
	}
	public double getaAltura()
	{
		double aAltura = minhaAltura;
		return aAltura;
	}
}
