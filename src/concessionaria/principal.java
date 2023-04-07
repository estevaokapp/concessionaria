package concessionaria;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		pedido pedido = new pedido();
		System.out.println("## PROGRAMA DA CONCESSIONARIA");

		System.out.println("Informe o modelo do carro");
		pedido.setModelo(scan.next());

		System.out.println(" Informe o ano do veiculo");
		pedido.setAno(scan.nextInt());

		System.out.println("Informe a cor do veiculo");
		pedido.setCor(scan.next());
		System.out.println(" Informe o valor do veiculo");
		pedido.setPreco(scan.nextDouble());
		System.out.println(" Informe a quantidade de parcelas ");
		pedido.setParcela(scan.nextInt());

		compra compra = new compra();
		compra.calcularpreco(pedido);

		pedido.exibirFicha();
	}

}
