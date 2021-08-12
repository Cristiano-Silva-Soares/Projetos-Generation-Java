package ColletionsExceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercadinho 
{
	public static void main(String[] args)
	{
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n\tControle de Estoque. ");
			System.out.println("*******************************************************************************");
			System.out.println("\nDe acordo com a sua necessidade, entre com uma das opções abaixo: "
					+"\n(1) Adicione algum produto ao estoque."
					+"\n(2) Remova produtos do estoque."
					+"\n(3) Atualizar produtos do estoque."
					+"\n(4) Mostrar todos os produtos em estoque."
					+"\n(0) Fecha o painel de controle.");
			System.out.println("*******************************************************************************");
			
			System.out.println("\n\tDigite o comando que se adeque a sua necessidade: ");
			num = leia.nextInt();
			
			switch(num) 
			{
			case 1:
				leia.nextLine();
				System.out.println("\nEntre com o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que será removido do estoque: ");
				String produtoR = leia.nextLine();
				if(estoque.contains(produtoR))
				{
						estoque.remove(produtoR);
				}
				else
				{
					System.out.println("\nO produto digitado não está presente em nosso estoque...");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nEntre com o código do que quer atualizar: ");
				String procurar = leia.nextLine();
				System.out.println("\nEntre com o nome do produto"+procurar+" : ");
				String novoproduto = leia.nextLine();
				if (estoque.contains(procurar))
				{
					estoque.remove(procurar);
					estoque.add(novoproduto);
				}
				else
				{
					System.out.println("\nO produto digitado não está presente em nosso estoque...");
				}
				break;
			case 4:
				System.out.println("\nProdutos do estoque: ");
				System.out.println("\n"+estoque);
				break;
			default:
				System.out.println("Programa finalizado, obrigado por utilizar de nossos serviços.");
			}
		}
		while(num != 0);
	}
}
