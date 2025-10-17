package repositorioGenerico;

import java.util.*;

public class Repositorio<T> {
	private List<T> lista = new ArrayList<>();
	
	public void adicionar(T elemento) {
		lista.add(elemento);
	}
	
	public T obter(int indice) {
		return lista.get(indice);
	}
	
	public int tamanho() {
		return lista.size();
	}
	
	public boolean removerPorIndice(int indice) {
		if (indice >= 0 && indice < tamanho()) {
			lista.remove(indice);
			return true;
		}
		return false;
	}
	
	public void limpar() {
		lista.clear();
	}
	
	public void listar() {
		for (T elemento : lista) {
			System.out.println(elemento);
		}
	}
}

