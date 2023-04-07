package concessionaria;

public class carro {

	private String Modelo;
	private int Ano;
	private double Preco;
	private int Parcela;
	private int Taxa;

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

	public int getTaxa() {
		return this.Taxa;
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

	public void setTaxa(int Taxa) {
		this.Taxa = Taxa;
	}

}
