package P.o.o.Polimorfismo;

public class cavalo1 extends animals
{
	private int corre;
	
	public cavalo1(int corre)
	{
		super("Cavalo");
		this.corre = corre;
	}
	
	public int getCorre() {
		return corre;
	}

	public void setCorre(int corre) {
		this.corre = corre;
	}

	@Override
	public String nome() {
		System.out.println("Markito");
		return "Markito";
	}
	@Override
	public int idade() {
		System.out.print(15);
		return 15;
	}
	@Override
	public String emitesom() 
	{
		System.out.println("Markito emite sons quando quer comer maçã...");
		return "Markito emite sons quando quer comer maçã...";
	}
	public void imprime2()
	{
		System.out.println("Quando Markito participa de circuitos chega a correr  "+getCorre()+"  km/h...");
	}
	
}
