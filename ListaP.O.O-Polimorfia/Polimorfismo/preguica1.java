package P.o.o.Polimorfismo;

public class preguica1 extends animals
{
	private int sobeArvore;
	
	public preguica1(int sobeArvore)
	{
		super("Pregui�a");
		this.sobeArvore = sobeArvore;
	}
	public int getSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(int sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	@Override
	public String nome() {
		System.out.println("Roberto");
		return "Roberto";
	}
	@Override
	public int idade() {
		System.out.println(38);
		return 38;
	}
	@Override
	public String emitesom() {
		System.out.println("Quando Roberto se sente amea�ado, acaba emitindo sons por suas narinas...");
		return "Quando Roberto se sente amea�ado, acaba emitindo sons por suas narinas...";
	}
	void imprime3()
	{
		System.out.println("Roberto leva em m�dia "+getSobeArvore()+" dias para subir em uma �nica �rvore...");
	}
	
}
