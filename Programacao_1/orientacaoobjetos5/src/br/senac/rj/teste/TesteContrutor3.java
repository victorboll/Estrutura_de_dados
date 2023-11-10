package br.senac.rj.teste;

public class TesteContrutor3 {

	public static void main(String[] args) {
		Conta3 conta2 = new Conta3();
		String texto = null; //Se você não inicializar, ele não inicializa automaticamente
		System.out.println("Titular = " + conta2.getTitular()); // Ele inicializa automaticamente quando o objeto é inicializado, sem precisar de um valor
		System.out.println(texto);
		
		Conta3 conta1 = new Conta3(33, 101);
		System.out.println("Novo titular = " + conta1.getTitular()); //Como o construtor padrão foi chamado pelo construtor com assinatura, ele vai instanciar os 2 construtores 
		System.out.println("Agência = " + conta1.getAgencia());
		System.out.println("Número da conta = " + conta1.getNumero());
		
	}

}
