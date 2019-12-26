package Repositorios;

import java.util.ArrayList;
import Modelos.Livro;

public class RepositorioLivraria implements InterfaceBiblioteca {

	ArrayList<Livro> listaLivros = new ArrayList<Livro>();

	@Override
	public boolean salvarLivro(Livro livro) {
		if (livro == livro) {
			listaLivros.add(livro);
			System.out.println("livro " + livro.getTitulo() + " cadastrado com sucesso");
			return true;
		}
		return false;
	}

	@Override
	public boolean deletarLivro(long id) {
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getId() == id) {
				listaLivros.remove(i);
				System.out.println("EXCLUIDO COM SUCESSO");
				return true;
			}
		}
		return false;

	}

	@Override
	public Livro buscarLivro(long id) {
		for (int i = 0; i < listaLivros.size(); i++) {
			System.out.println("nome: " + listaLivros.get(i).getTitulo());
		}
		return null;
	}

	@Override
	public ArrayList<Livro> listarLivros() {
		for (Livro s : listaLivros) {
			System.out.println(s);
		}
		return listaLivros;
	}

	@Override
	public boolean alterarLivro(String titulo,String autor, int anoLancamento,long id) {
		Livro livro = buscarLivro(id);
		if(livro != null) {
			livro.setTitulo(titulo);
			livro.setAutor(autor);
			livro.setAnoLancamento(anoLancamento);
			livro.setId(id);
			return true;
		}
		return false;

	}
}
