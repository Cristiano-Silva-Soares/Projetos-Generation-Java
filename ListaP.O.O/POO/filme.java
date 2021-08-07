package POO;

public class filme 
{
	private String nomeDiretor;
	private String nomeFilme;
	private int anoLancamento;
	
		public filme(String diretor,String filme,int lancamento)
		{
			nomeDiretor=diretor;
			nomeFilme=filme;
			anoLancamento=lancamento;
		}
		public String getnomeDoDiretor()
		{
			 String nomeDoDiretor = nomeDiretor;
			 return nomeDoDiretor;
		}
		public String getnomeDoDilme()
		{
			String nomeDoFilme = nomeFilme;
			return nomeDoFilme;
		}
		public int getanoDeLancamento()
		{
			int anoDeLancamento = anoLancamento;
			return anoDeLancamento;
		}
}
