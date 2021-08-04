package ExercíciosLaçosCondicionais;

import java.util.*;

public class LacosCondicionais3 
{

	public static void main(String[] args) 
	{
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
			if (idade >= 10 && idade <= 14)
			{
				System.out.println("\nSua idade: "+idade+" , se encaixa na categoria infantil.");
			}
			else if (idade >=15 && idade <= 17)
			{
				System.out.println("\nSua idade: "+idade+" , se encaixa na categoria juvenil.");
			}
			else if (idade >= 18 && idade <= 25)
			{
				System.out.println("\nSua idade: "+idade+" , se encaixa na categoria adulta.");
			}
			else
			{
				System.out.println("\nA idade: "+idade+" , não se encaixa em nenhuma das categorias previstas.");
			}
						
			

	}

}
