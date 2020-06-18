package Exercicio03;

public class LivroDeLivraria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livraria = new Livro();
		livraria.nomeLivro = "A Teoria de Tudo";
		livraria.nomeAutor = "Stephen Hawking";
		livraria.anoLancamento = 2014;
		livraria.qtdPáginas = 448;
		
		System.out.println("Você selecionou o seguinte livro:");
		
		System.out.println();
		
		System.out.println(livraria.nomeLivro);
		System.out.println(livraria.nomeAutor);
		System.out.println(livraria.anoLancamento);
		System.out.println(livraria.qtdPáginas);
		
		System.out.println();
		System.out.println("Livro bom em neném!!");
	}

}
