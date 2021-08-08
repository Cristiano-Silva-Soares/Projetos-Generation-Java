package POO;

public class testeChuveiroEletrico 
{
	public static void main(String[] args)
	{
		chuveiroEletrico meuChuveiro = new chuveiroEletrico();
		meuChuveiro.temperaturaInicial = 19;
		meuChuveiro.temperaturaAtual = 35;
		
		meuChuveiro.vouBanhar();
		
		meuChuveiro.ligaChuveiro();
		
		meuChuveiro.mexeTemperatura(34);
	}
}
