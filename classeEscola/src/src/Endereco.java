package src;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private Cidade cidade;
	private String UF;
	Scanner ler = new Scanner(System.in);
	
	public Endereco() {
	
	}

	public Endereco(String rua, int numero, String bairro, Cidade cidade, String UF) {
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

		this.rua = rua;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		boolean saida;
		
		do {
			try {
			System.out.print("Digite o numero: ");
			numero = ler.nextInt();	
			this.numero = numero;
			saida = true;
			}
			catch (InputMismatchException e) {
				System.out.println("\nDigite somente numeros, por favor!\n");
				saida = false;
				ler.next();
			}
		} while(saida != true);
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {

		System.out.print("Digite o Bairro: ");
		bairro = ler.nextLine();
		bairro = ler.nextLine();
		this.bairro = bairro;
		
	}


	public Cidade getCidade() {
		return cidade;
	}


	public void setCidade(Cidade cidade) {
		boolean saida;
		
		do {
			try {
				System.out.println("Digite o numero da cidade:");
				System.out.println("1 - Belo Horizonte \t 5 - Sabara ");
				System.out.println("2 - NovaLima       \t 6 - Caete ");
				System.out.println("3 - Contagem       \t 7 - Neves ");
				System.out.println("4 - Betim          \t 8 - SantaLuzia ");
				byte opcCidade = ler.nextByte();
					switch (opcCidade) {
					case 1:
						cidade = Cidade.BH;
						saida = true;
						break;
					case 2:
						cidade = Cidade.NOVALIMA;
						saida = true;
						break;
					case 3:
						cidade = Cidade.CONTAGEM;
						saida = true;
						break;
					case 4:
						cidade = Cidade.BETIM;
						saida = true;
						break;
					case 5:
						cidade = Cidade.SABARA;
						saida = true;
						break;
					case 6:
						cidade = Cidade.CAETE;
						saida = true;
						break;
					case 7:
						cidade = Cidade.NEVES;
						saida = true;
						break;
					case 8:
						cidade = Cidade.SANTALUZIA;
						saida = true;
						break;
					default:
						System.out.println("Digite um numero da lista, por favor!\n");
						saida = false;
						break;
						}
				}
				catch (InputMismatchException e) {
					System.out.println("\nDigite somente numeros, por favor!\n");
					saida = false;
					ler.next();
				}
				finally {
					this.cidade = cidade;
				}
			}while(!saida);
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
