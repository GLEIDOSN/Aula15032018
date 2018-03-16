public class PrimeiroPrograma {
	public static void main(String[] args) {
		double valor1 = 20.90;
		double valor2 = 20.90;
		double soma = valor1 + valor2;
		System.out.println("A soma dos valores é: " + soma);
		
		Autor autor1  = new Autor();
		Autor autor2 = new Autor();
		
		Ebook ebook = new Ebook(autor2);
		ebook.setTitulo("Engenharia de Software");
		
		autor1.setNome("Gleidson Freitas");
		autor1.setEmail("Gleidson Freitas");
		autor1.setCpf("03745882657");
		
		Livro livro1 = new Livro(autor1);

		livro1.setTitulo("Padrões de Projeto");
		livro1.setResumo("Explicação sobre os padrões GoF");
		livro1.setPreco(100.00);
		livro1.setAutor(autor1);
		
		livro1.exibirDetalhes();
	}
}
