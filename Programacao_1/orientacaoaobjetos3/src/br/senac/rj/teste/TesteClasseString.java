package br.senac.rj.teste;

public class TesteClasseString {

	public static void main(String[] args) {
		String nome = " Ricardo ";
		int idade = 20;
		System.out.println("Nome = " + nome);
		char posicao3 = nome.charAt(3);
		boolean vazio = nome.isEmpty();
		boolean emBranco = nome.isBlank();
		int tamanho = nome.length();
		String parte = nome.substring(0, 4);
		String minuscula = nome.toLowerCase();
		String maiuscula = nome.toUpperCase();
		String semEspacos = nome.trim();
		String converteString = String.valueOf(idade);
		System.out.println("posicao3 = " + posicao3);
		System.out.println("vazio = " + vazio);
		System.out.println("em branco = " + emBranco);
		System.out.println("tamanho = " + tamanho);
		System.out.println("parte = " + parte);
		System.out.println("minuscula = " + minuscula);
		System.out.println("maiuscula = " + maiuscula);
		System.out.println("semEspacos = " + semEspacos);
		System.out.println("tamanho de converteString = " + converteString.length());
		System.out.println("nome=\"Ricardo\" = " + nome.trim().toUpperCase().equals("RICARDO")); 
		//Sequencia Scape = Você coloca uma barra invertida antes do caracter para incluir aquele caracter dentro da string, sem ele achar que você está usando uma nova aspas
				
			
			
			
	}

}
