package Principal;

import Modelos.Livro;
import Repositorios.RepositorioLivraria;

public class AppLivraria {
	public static void main(String[] args) {
		// ainda não fiz testes pois só fiz o metodo add , quando fizer o listar ja é
		// possivel testar melhor.

		RepositorioLivraria livro = new RepositorioLivraria();

		Livro livro1 = new Livro();
		livro1.setTitulo("orca");
		livro1.setId(2);
		livro.AdicionarLivro(livro1);
		//livro.deletarLivro(2);
		livro.buscarLivro(2);
		livro.Listar();

	}

}
