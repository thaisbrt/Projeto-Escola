package src;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int x;
		Scanner ler = new Scanner(System.in);
		Aluno a = new Aluno();
		Professor p = new Professor();
		
		do{
		x = menu();
		
		switch (x) {
		case 1:
			a.cadastrarAluno();
			break;
			
		case 2:
			p.cadastrarProfessor();
			break;
			
		case 3:
			a.dadosAluno();
			break;
			
		case 4:
			p.dadosProfessor();
			break;
			
		default:
			break;
			}
		}while(x != 5);
		
		ler.close();

	}
	
	public static int menu() {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\n" + "MENU PRINCIPAL" +
				"\n........................" +
				"\n1_ Cadastrar Aluno" + 
				"\n2_ Cadastrar Professor" + 
				"\n3_ Exibir dados da Aluno" + 
				"\n4_ Exibir dados da Professor" + 
				"\n5_ Sair"
				);
		return ler.nextInt();
	}

}

