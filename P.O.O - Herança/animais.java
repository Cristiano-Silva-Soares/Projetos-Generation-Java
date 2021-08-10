package POO;

public class animais 
{
	private String nome;
	private String especie;
	private String classe;
	private String alimentacao;
	
	public animais (String nome,String especie,String classe,String alimentacao)
	{
		super();
		this.nome = nome;
		this.especie = especie;
		this.classe = classe;
		this.alimentacao = alimentacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	
}
