package src;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Professor extends Pessoafisica implements Impostos{
	private Forma form;
	private float salario;
	private int cargaHoraria;
	protected double salarioIR;
	Scanner ler = new Scanner(System.in);

	
	public Professor() {
		super();
		this.form = new Forma();
	}

	public Professor(Forma form, float salario, int cargaHoraria, String cpf, String nome, Sexo sexo, Endereco endereco, byte ra, String curso, float mensalidade, double salarioIR) {
		super(nome, cpf, sexo, endereco);
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
		this.form = form;
		this.salarioIR = salarioIR;
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
		boolean saida;
		
		do {
			try {
				System.out.print("Digite o salario: ");
				salario = ler.nextFloat();
				saida = true;
			}
			catch (InputMismatchException e) {
			System.out.println("\nDigite somente numeros, por favor!\n");
			saida = false;
			ler.next();
			}
			finally {
				this.salario = salario;
			}
		}while(!saida);
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		boolean saida;
		
		do {
			try {
				System.out.print("Digite a carga hororia: ");
				cargaHoraria = ler.nextInt();
				saida = true;
			}
			catch (InputMismatchException e) {
			System.out.println("\nDigite somente numeros, por favor!\n");
			saida = false;
			ler.next();
			}
			finally {
				this.cargaHoraria = cargaHoraria;
			}
		
		}while(!saida);
	}
	
	public double getSalarioIR() {
		return salarioIR;
	}

	public void cadastrarProfessor() {

		System.out.println("\n-- Cadastramento Professor --");

		setCpf(cpf);
		setNome(nome);
		setSexo(sexo);
		setSalario(salario);
		setCargaHoraria(cargaHoraria);
		form.cadastrarForma();
		IR(salario);
		cadastrarEnd();
	}

	public void dadosProfessor() {
		System.out.println("\nDADOS PROFESSOR\n"
							+ "-----------------" 
							+ "\n   CPF: " + getCpf() 
							+ "\n   nome: "	+ getNome() 
							+ "\n   sexo: " + getSexo()
							+ "\n   salario sem IR: " +getSalario()
							+ "\n   salario com desconto de IR: "+ IR(salario));
		form.dadosForma();
		dadosEnd();


	}
	
	@Override
	public double IR(double salario) {
		if (salario <= 1903.98) {
			salario -= faixa1;
		} 
		else if (salario > 1903.98 && salario <= 2826.65) 
		{
			salario -= faixa2;
		}
		else if (salario > 2826.65 && salario <= 3751.05)
		{
			salario-= faixa3;
		}
		else if (salario > 3751.05 && salario <= 4664.68)
		{
			salario-= faixa4;
		}
		else  
		{
			salario-= faixa5;
		}
		
		salarioIR = salario;
		
		return salarioIR;
	}
	
}

