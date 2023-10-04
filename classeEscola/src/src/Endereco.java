package src;

import java.util.Scanner;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String UF;
	Scanner ler = new Scanner(System.in);
	
	public Endereco() {
	
	}

	public Endereco(String rua, int numero, String bairro, String cidade, String UF) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.UF = UF;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		System.out.print("Digite a Rua: ");
		rua = ler.nextLine();

		this.rua = rua.toUpperCase();
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		System.out.print("Digite o numero: ");
		numero = ler.nextInt();	
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {

		System.out.print("Digite o Bairro: ");
		bairro = ler.nextLine();
		this.bairro = bairro.toUpperCase();
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		System.out.print("Digite a Cidade: ");
		cidade = ler.nextLine();
		
		this.cidade = cidade.toUpperCase();
	}


	public String getUF() {
		return UF;
	}


	public void setUF(String UF) {
		System.out.print("Digite a UF: ");
		UF = ler.nextLine();
		this.UF = UF.toUpperCase();
	}
	
	public void cadastrarEndereco() {

		setUF(UF);	
		setCidade(cidade);
		setBairro(bairro);
		setRua(rua);
		setNumero(numero);
	}
	
	public void dadosEndereco() {
		
		System.out.println(  "   Cidade:" + getCidade()
							+"\n   UF: " + getUF()
							+"\n   Bairro: " + getBairro()
							+"\n   Rua: " + getRua()
							+"\n   Numero: " + getNumero());

	}
	


	

}
