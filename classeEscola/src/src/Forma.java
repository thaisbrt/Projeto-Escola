package src;

import java.util.Scanner;

public class Forma {
	
	private String titulo;
	private String nomeCurso;
	private int chCurso;
	Scanner ler = new Scanner(System.in);
	
	public Forma() {
		super();
	}
	public Forma(String titulo, String nomeCurso, int chCurso) {
		this.titulo = titulo;
		this.nomeCurso = nomeCurso;
		this.chCurso = chCurso;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		System.out.print("Digite o titulo: ");
		titulo = ler.nextLine();
		this.titulo = titulo;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		System.out.print("Digite o nome do curso: ");
		nomeCurso = ler.nextLine();
		this.nomeCurso = nomeCurso;
	}
	public int getChCurso() {
		return chCurso;
	}
	public void setChCurso(int chCurso) {
		System.out.print("Digite a carga hor�ria do curso: ");
		chCurso = ler.nextInt();
		this.chCurso = chCurso;
	}
	
	public void cadastrarForma() {
		
		System.out.println();
		setTitulo(titulo);	
		setNomeCurso(nomeCurso);
		setChCurso(chCurso);
	}
	
	public void dadosForma() {
		
		System.out.println(  "   Titulo:" + getTitulo()
							+"\n   Nome do Curso: " + getNomeCurso()
							+"\n   Craga hor�ria: " + getChCurso());

	}
	
	

}
