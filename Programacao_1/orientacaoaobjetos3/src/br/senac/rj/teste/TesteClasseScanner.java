package br.senac.rj.teste;

import java.util.Scanner;

public class TesteClasseScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um nome: ");
		String nome = sc.nextLine();
		System.out.print("Entre com a nota1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Entre com a nota2: ");
		double nota2 = sc.nextDouble();
		/*String nome = sc.nextLine();
		double media = (nota1 + nota2) / 2;
		Ele iria pular essa instrução se ele tivesse depois dos 
		nextDouble porque a informação estaria no buffer, o enter no caso*/
		double media = (nota1 + nota2) / 2;
		System.out.println("A média do aluno " + nome + " é " + media);
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Entre com a nota1: ");
		double nota11 = Double.parseDouble(sc1.nextLine());
		System.out.print("Entre com a nota2: ");
		double nota12 = Double.parseDouble(sc1.nextLine());
		System.out.print("Entre com um nome: ");
		String nome1 = sc1.nextLine();
		double media1 = (nota11 + nota12) / 2;
		System.out.println("A média do aluno " + nome1 + " é " + media1);
		sc1.close();
		sc.close();
			
	}

}
