package Principal;

import Modelos.Livro;
import Repositorios.RepositorioLivraria;

public class AppLivraria {
	public static void main(String[] args) {
		// ainda n�o fiz testes pois s� fiz o metodo add , quando fizer o listar ja �
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
