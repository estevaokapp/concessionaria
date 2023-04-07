package concessionaria;

public class pedido {
	private String Modelo;
	private int Ano;
	private double Preco;
	private int Parcela;
	private String Cor;

	// GET DAS VARIAVEIS//
	public String getModelo() {
		return this.Modelo;
	}

	public int getAno() {
		return this.Ano;
	}

	public double getPreco() {
		return this.Preco;
	}

	public int getParcela() {
		return this.Parcela;
	}

	public String getCor() {
		return this.Cor;
	}

	// SET DAS VARIAVEIS//
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public void setAno(int Ano) {
		this.Ano = Ano;
	}

	public void setPreco(double Preco) {
		this.Preco = Preco;
	}

	public void setParcela(int Parcela) {
		this.Parcela = Parcela;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;

	}

	public void exibirFicha() {
		System.out.printf("|||------------------------------------------------------------------------|\n");
		System.out.printf("||  %s |\n", String.format("%-19s", "Modelo do veiculo :" + this.Modelo));
		System.out.printf("||  %s |\n", String.format("%-19s", "Ano do veiculo : " + this.Ano));
		System.out.printf("||  %s |\n", String.format("%-19s", "Cor do veiculo:" + this.Cor));
		System.out.printf("||  %s |\n", String.format("%-19s", "valor do veiculo : " + this.Preco));
		System.out.printf("||  %s |\n", String.format("%-19s", "Quantidade de Parcelas : " + this.Parcela));
		System.out.printf("|||------------------------------------------------------------------------|\n");
	}
}
