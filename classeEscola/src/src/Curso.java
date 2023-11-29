package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Curso implements Mensalidade{
	
	private NomeCurso nome;
	private int tipo;
	private int ch;
	private float duracao;
	private double mensalidade;
	Scanner ler = new Scanner(System.in);
	
	public Curso() {

	}
	
	public Curso(NomeCurso nome, int tipo, int ch, float duracao, float mensalidade) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.ch = ch;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}
	
	public NomeCurso getNome() {
		return nome;
	}
	
	public void setNome(NomeCurso nome) {
		boolean saida;
		
		do {
			
			try {
					System.out.println("Digite o nome do curso: "
					+ "(1- ADS) " 
					+"(2- Ciencia da Computacao) "
					+ "(3-Sistema da Informacao)");
					byte opcNomeCurso = ler.nextByte();
						switch (opcNomeCurso) {
						case 1:
							nome = NomeCurso.ADS;
							saida = true;
							break;
						case 2:
							nome = NomeCurso.COMPUTACAO;
							saida = true;
							break;
						case 3:
							nome = NomeCurso.SISINFO;
							saida = true;
							break;
						default:
							System.out.println("\n ...por favor, digite 1, 2 ou 3! ...\n");
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
					this.nome = nome;
				}
			
			} while(saida != true);
			
	}
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		boolean saida;
		
		do {
			try {
				System.out.print("Digite o tipo do curso: (1 - Lincenciatura) "
						+ "(2 - Tecnologo)"
						+ " (3 - Bacharel) ");
						tipo = ler.nextInt();
						
						if(tipo == 1 || tipo == 2 || tipo == 3) {
							
							saida = true;
							break;
						}else{
							System.out.println("\n... por favor, digite 1, 2 ou 3...\n");
							saida = false;
						}
				}
				catch (InputMismatchException e) {
					System.out.println("\nDigite somente numeros, por favor!\n");
					saida = false;
					ler.next();
				}
				finally {
					this.tipo = tipo;
				}
			}
		while(saida != true);
	}

	public int getCh() {
		return ch;
	}
	public void setCh(int tipo) {
		
		if(tipo == 1) {
			ch = chTenologo;
		}else if(tipo == 2) {
			ch = chBacharelado;
		}else {
			ch = chLicenciatura;
		}
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
	boolean saida;
			
			do {
				try {
			System.out.print("Digite a do duracao: ");
			duracao = ler.nextFloat();	
			this.duracao = duracao;
            saida = true;
            } catch (java.util.InputMismatchException e) {
	            System.out.println("\nDigite somente numeros, por favor!\n");
	            saida = false;
	            ler.next();

	        }
		}while(!saida);
    
	}


	public void cadastrarCurso() {

		setNome(nome);	
		setTipo(tipo);
		setCh(tipo);
		setDuracao(duracao);
		CalculoMensalidade(tipo);
	}
	
	public void dadosCurso() {
		
		System.out.println(  "   Nome:" + getNome()
							+"\n   Tipo: " + (getTipo() == 1 ? "Licenciatura" : getTipo() == 2 ? "Tecnologo" : "Bacharelado")
							+"\n   Carga Horaria: " + getCh()
							+"\n   Duracao: " + getDuracao()
							+"\n   Mensalidade: " + CalculoMensalidade(tipo));

	}
	


	@Override
	public double CalculoMensalidade(int tipo) {
		
		if(tipo == 1) {
			mensalidade = licenciatura;
		}
		else if(tipo == 2) {
			mensalidade = tecnologo;
		}
		else if(tipo == 3){
			mensalidade = bacharelado;
		}
		return mensalidade;
	}

}
