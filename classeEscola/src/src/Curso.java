package src;

import java.util.Scanner;

public class Curso {
	
	private String nome;
	private String tipo;
	private int ch;
	private float duracao;
	private float mensalidade;
	Scanner ler = new Scanner(System.in);
	
	public Curso() {

	}
	
	public Curso(String nome, String tipo, int ch, float duracao, float mensalidade) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.ch = ch;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		System.out.print("Digite o nome do curso: ");
		nome = ler.nextLine();	
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		System.out.print("Digite o tipo do curso: ");
		tipo = ler.nextLine();	
		this.tipo = tipo;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		System.out.print("Digite a carga hor�ria: ");
		ch = ler.nextInt();	
		this.ch = ch;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		System.out.print("Digite o tipo do duracao: ");
		duracao = ler.nextFloat();	
		this.duracao = duracao;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		System.out.print("Digite o valor da mensalidade: ");
		mensalidade = ler.nextFloat();	
		this.mensalidade = mensalidade;
	}

	public void cadastrarCurso() {

		setNome(nome);	
		setTipo(tipo);
		setCh(ch);
		setDuracao(duracao);
		setMensalidade(mensalidade);
	}
	
	public void dadosCurso() {
		
		System.out.println(  "   Nome:" + getNome()
							+"\n   Tipo: " + getTipo()
							+"\n   Ch: " + getCh()
							+"\n   Duracao: " + getDuracao()
							+"\n   Mensalidade: " + getMensalidade());

	}
	
	
	

}
