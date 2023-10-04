package src;

import java.util.Scanner;

abstract class Pessoafisica {
	
	protected String nome;
	protected String cpf;
	protected String sexo;
	protected Endereco endereco;
	Scanner ler = new Scanner(System.in);
	
	public Pessoafisica() {
		this.endereco = new Endereco();
	}

	public Pessoafisica(String nome, String cpf, String sexo, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;

	}
	
	public void setNome(String nome) {
		System.out.print("Digite o nome: ");
		nome = ler.nextLine();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		System.out.println("Informe o CPF: ");
		cpf = ler.nextLine();
		
		while(cpf.length() != 11){
			System.out.println("Informe um CPF valido");
			System.out.println("Informe o CPF: ");
			cpf = ler.nextLine();
		}
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		System.out.print("Digite o sexo: ");
		sexo = ler.nextLine();
		this.sexo = sexo;
	}
	
	public void cadastrarEnd() {
		endereco.cadastrarEndereco();
	}
	
	
	public void dadosEnd() {
		endereco.dadosEndereco();
	}
	
	
}

