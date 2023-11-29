package src;

import java.util.Scanner;

public class Aluno extends Pessoafisica {
	private byte ra;
	private Curso curso;
	private float mensalidade;	
	

	Scanner ler = new Scanner(System.in);

	public Aluno() {
		super();
		this.curso = new Curso();
	}

	public Aluno(String CPF, String nome, Sexo sexo, Endereco endereco, byte ra, Curso curso, float mensalidade) {
		super(nome, CPF, sexo, endereco);
		this.ra = ra;
		this.curso = curso;
		this.mensalidade = mensalidade;
	}
	
	public float getMensalidade() {
		return mensalidade;
	}


    public void setRa(float mensalidade) {
            this.mensalidade = mensalidade;
    }

	public int getRa() {
		return ra;
	}
	
    public void setRa(byte ra) {
		boolean saida;
		
		do {
	        try {
	            System.out.print("Digite o Registro Academico do aluno(a): ");
	            ra = ler.nextByte();
	            this.ra = ra;
	            saida = true;
	            
	        } catch (java.util.InputMismatchException e) {
	            System.out.println("\nDigite somente números, por favor!\n");
	            saida = false;
	            ler.next();

	        }
		}while(!saida);
    }


	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void cadastrarAluno() {

		System.out.println("\n-- Cadastramento Aluno --");
		
		setCpf(cpf);
		setNome(nome);
		setSexo(sexo);
		setRa(ra);
		curso.cadastrarCurso();
		cadastrarEnd();
	}

	public void dadosAluno() {
		System.out.println("\nDADOS ALUNO\n" 
							+ "-----------------" 
							+ "\n   CPF: " + getCpf() 
							+ "\n   nome: "	+ getNome() 
							+ "\n   sexo: " + getSexo()
							+ "\n   RA: " + getRa());
		
							curso.dadosCurso();
							dadosEnd();

	}
}

