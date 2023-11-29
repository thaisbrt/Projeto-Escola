package src;


import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Pessoafisica {
	
	protected String nome;
	protected String cpf;
	protected Sexo sexo;
	protected Endereco endereco;
	Scanner ler = new Scanner(System.in);
	
	public Pessoafisica() {
		this.endereco = new Endereco();
	}

	public Pessoafisica(String nome, String cpf, Sexo sexo, Endereco endereco) {
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
		boolean saida;
		
		do {
			try {
				System.out.println("Informe o CPF: ");
				cpf = ler.nextLine();
				
				while(cpf.length() != 11){
					System.out.println("Informe um CPF valido");
					System.out.println("Informe o CPF: ");
					cpf = ler.nextLine();
					}
				saida = true;
				}
				catch (InputMismatchException e) {
					System.out.println("\nDigite somente numeros, por favor!\n");
					saida = false;
					ler.next();
				}
				finally {
					this.cpf = cpf;				}
			
			} while(!saida);
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		boolean saida;
		
		do {
			try {
				System.out.print("Digite o Sexo:"
								+ " (1 - Masculino) (2 - Feminino) ");
				byte opcSexo = ler.nextByte();
				
					switch (opcSexo) {
				case 1:
					sexo = Sexo.MASCULINO;
					saida = true;
					break;
				case 2:
					sexo = Sexo.FEMININO;
					saida = true;
					break;
				default:
					System.out.println("\n... por favor, digite 1, 2 ou 3! ...\n");
					saida = false;
					break;
						}
				}
				catch (InputMismatchException e) {
						System.out.println("\n... por favor, digite 1, 2 ou 3! ...\n");
						saida = false;
						ler.next();
					}
					finally {
						this.sexo = sexo;				}
				
			} while(!saida);
	}

	
	public void cadastrarEnd() {
		endereco.cadastrarEndereco();
	}
	
	
	public void dadosEnd() {
		endereco.dadosEndereco();
	}
	
	
}

