package Exercicio04;

import java.util.Date;

public class LivroDeLivraria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livro livraria = new Livro();
		LivroDeBiblioteca emprestimo = new LivroDeBiblioteca();
		
		livraria.nomeLivro = "A Teoria de Tudo";
		livraria.nomeAutor = "Stephen Hawking";
		livraria.anoLancamento = 2014;
		livraria.qtdPáginas = 448;
		
		emprestimo.emprestado = true;
		emprestimo.dataEntrega =  new Date();
		emprestimo.empresatadoA = "Loiane";
		
		System.out.println("Você selecionou o seguinte livro:");
		
		System.out.println();
		
		System.out.println(livraria.nomeLivro);
		System.out.println(livraria.nomeAutor);
		System.out.println(livraria.anoLancamento);
		System.out.println(livraria.qtdPáginas);
		
		System.out.println();
		
		System.out.println("Livro emprestado para:");
		
		System.out.println(emprestimo.empresatadoA + " em " + emprestimo.dataEntrega);

	}

}
