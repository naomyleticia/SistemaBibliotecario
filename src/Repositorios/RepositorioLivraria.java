package Repositorios;

import java.util.ArrayList;

import Modelos.Bibliotecario;
import Modelos.Livro;

public class RepositorioLivraria implements InterfaceBiblioteca {
	
	ArrayList<Livro> listaLivros = new ArrayList<Livro>();
	@Override
	public boolean salvarLivro(Livro livro) {
		if(livro==livro) {
			listaLivros.add(livro);
			System.out.println("livro "+livro.getTitulo()+" cadastrado com sucesso");
			return true;
		}
		return false;
	}

	@Override
	public boolean deletarLivro(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Livro> listarLivros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterarLivro(Livro livro) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
