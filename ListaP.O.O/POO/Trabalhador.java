package POO;

import java.text.NumberFormat;

public class Trabalhador 
{
	String nome;
	double salario;
	int anosTrabalho;
	double scomAdicional;
	
	public String getfichaSalarial()
	{
		String nomeColaborador = nome;
		return nomeColaborador;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public double getSalario() 
	{
		return salario;
	}
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	public int getAnosTrabalho() 
	{
		return anosTrabalho;
	}
	public void setAnosTrabalho(int anosTrabalho) 
	{
		this.anosTrabalho = anosTrabalho;
	}
	public double getScomAdicional() 
	{
		return scomAdicional;
	}
	public void setScomAdicional(double scomAdicional) 
	{
		this.scomAdicional = scomAdicional;
	}
	public double getsalarioComum()
	{
		double salarioSemAdicao = salario;
		return salarioSemAdicao;
	}
	public int getanosServico()
	{
		int anosBatalhando = anosTrabalho;
		return anosBatalhando;
	}
	void defineSalario()
	{
		if(this.anosTrabalho >= 0 && this.anosTrabalho < 2)
		{
			System.out.println("Você ainda não tem tempo de serviço suficiente para um aumento...");
		}
		if(this.anosTrabalho >= 2 && this.anosTrabalho < 4)
		{
			scomAdicional = this.salario + 500;
		}
		if(this.anosTrabalho >= 4 && this.anosTrabalho < 7)
		{
			scomAdicional = this.salario + 1000;
		}
		if(this.anosTrabalho >= 7 && this.anosTrabalho <= 10)
		{
			scomAdicional = this.salario + 1500;
		}
		else
		{
			scomAdicional = this.salario + 2000;
		}
	}
	public String formataMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	public void imprime() 
	{
		System.out.println(this.nome+"\t\t"+"anos: "+this.anosTrabalho+"\t\t"+"salario :"+this.formataMoeda());
	}
}
