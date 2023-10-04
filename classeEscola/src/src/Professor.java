package src;

import java.util.Scanner;

public class Professor extends Pessoafisica{
	private Forma form;
	private float salario;
	private int cargaHoraria;
	Scanner ler = new Scanner(System.in);

	
	public Professor() {
		super();
		this.form = new Forma();
	}

	public Professor(Forma form, float salario, int cargaHoraria, String cpf, String nome, String sexo, Endereco endereco, byte ra, String curso, float mensalidade) {
		super(nome, cpf, sexo, endereco);
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
		this.form = form;
	}
	


	public Forma getForm() {
		return form;
	}

	public void setForm(Forma form) {
		this.form = form;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void cadastrarProfessor() {

		System.out.println("\n-- Cadastramento --");

		setCpf(cpf);
		setNome(nome);
		setSexo(sexo);
		form.cadastrarForma();
		cadastrarEnd();
	}

	public void dadosProfessor() {
		System.out.println("\nDADOS PROFESSOR\n"
							+ "-----------------" 
							+ "\n   CPF: " + getCpf() 
							+ "\n   nome: "	+ getNome() 
							+ "\n   sexo: " + getSexo());
		form.dadosForma();
		dadosEnd();


	}

	
}

