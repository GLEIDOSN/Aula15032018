public class PrimeiroPrograma {
	public static void main(String[] args) {
		double valor1 = 20.90;
		double valor2 = 20.90;
		double soma = valor1 + valor2;
		System.out.println("A soma dos valores �: " + soma);
		
		Autor autor1  = new Autor();
		Autor autor2 = new Autor();
		
		Ebook ebook = new Ebook(autor2);
		ebook.setTitulo("Engenharia de Software");
		
		autor1.setNome("Gleidson Freitas");
		autor1.setEmail("Gleidson Freitas");
		autor1.setCpf("03745882657");
		
		Livro livro1 = new Livro(autor1);

		livro1.setTitulo("Padr�es de Projeto");
		livro1.setResumo("Explica��o sobre os padr�es GoF");
		livro1.setPreco(100.00);
		livro1.setAutor(autor1);
		
		livro1.exibirDetalhes();
	}
}
