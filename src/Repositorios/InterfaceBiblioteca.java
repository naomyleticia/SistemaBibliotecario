package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Modelos.Bibliotecario;
import Modelos.Livro;

public interface InterfaceBiblioteca {
	public boolean salvarLivro(Livro livro);
	public boolean deletarLivro(long id);
	public ArrayList<Livro> listarLivros();
	public boolean alterarLivro(Livro livro);
	boolean AdicionarLivro(Livro livro);
}
