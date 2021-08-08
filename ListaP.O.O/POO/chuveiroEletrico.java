package POO;

public class chuveiroEletrico 
{
	int temperaturaInicial;
	int temperaturaAtual;
	
	public void vouBanhar()
	{
		System.out.println("\nTemperatura fora do banheiro: "+temperaturaInicial);
	}
	void ligaChuveiro()
	{
		System.out.println("**************************************");
		System.out.println("\nEntro no box, e ligo o chuveiro...");
	}
	
	 void mexeTemperatura(int graus)
	{
		if(this.temperaturaAtual < 34)
		{
			int temperaturaNova = this.temperaturaAtual + graus;
			this.temperaturaAtual = temperaturaNova;
			
			System.out.print("Temperatura atual: "+temperaturaAtual);
		}
		else
		{
			int diminuirTemperatura = this.temperaturaAtual - graus;
			this.temperaturaAtual = diminuirTemperatura;
			
			System.out.print("Temperatura atual: "+temperaturaAtual);
		}
	}
	
}
