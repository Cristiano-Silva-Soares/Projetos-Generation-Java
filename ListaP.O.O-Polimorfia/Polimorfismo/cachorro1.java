package P.o.o.Polimorfismo;

public class cachorro1 extends animals
{
	private int run;
	
	public cachorro1(int run)
	{
		super("Cachorro");
		this.run = run;
	}
	
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public void imprime1()
	{
		System.out.println("Quando Pablito corre atrás de um carro, pode chegar a até  "+getRun()+" km/h...");
	}
	@Override
	public String nome() {
		System.out.println("Pablito...");
		return "Pablito...";
	}
	@Override
	public int idade() {
		System.out.print(4);
		return 4;
	}
	@Override
	public String emitesom() {
		System.out.println("Pablito pode emitir sons ao ver o carteiro passar...");
		return "Pablito pode emitir sons ao ver o carteiro passar...";
	}
}
