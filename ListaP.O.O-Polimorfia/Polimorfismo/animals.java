package P.o.o.Polimorfismo;

abstract public class animals 
{
	private String tipo;
	
	
	abstract public String nome();
	abstract public int idade();
	abstract public String emitesom();
	
	
	public animals (String tipo)
	{
		super();
		this.tipo = tipo;
		
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}



