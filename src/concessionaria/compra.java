package concessionaria;

import java.util.*;

public class compra {

	public pedido calcularpreco(pedido pedido) {

		Scanner scan = new Scanner(System.in);
		double preco = 0;
		int parcela = 0;
		int total = 0;
		int valor = 0;
		double taxa = 0.02;
		double v1 =0;
		double v2 =0;
		double v3 = 0;
		System.out.printf("|||------------------------------------------------------------------------|\n");
		System.out.printf("||  %s |\n", String.format("%-19s", "Confirme os valores  :"));
		System.out.printf("|||------------------------------------------------------------------------|\n");

		System.out.println("informe o valor do veiculo");
		preco = scan.nextDouble();
		System.out.println("informe a quantidade de parcelas");
		parcela = scan.nextInt();
		valor = (int) (preco/parcela);
		v1 = valor * taxa;
		v2 = v1 + valor;
		v3 = preco + v2;
		System.out.printf("|||------------------------------------------------------------------------|\n");
		System.out.printf("||  %s |\n", String.format("%-19s", "valor das parcelas  :" + v2 + " Reais"));
		System.out.printf("|||------------------------------------------------------------------------|\n");
		System.out.printf("||  %s |\n", String.format("%-19s", " valor total do veiculo  :" + v3 + " Reais"));
		pedido ped = new pedido();

		ped.setModelo(pedido.getModelo());
		ped.setAno(pedido.getAno());
		ped.setPreco(pedido.getPreco());
		ped.setParcela(ped.getParcela());
	
		return ped;
	
	}

}
