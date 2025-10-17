package repositorioGenerico;

public class Produto extends Repositorio<String> {
	private String nome;
	private int codigo;
	
	public Produto(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
	    return "Produto{nome='" + nome + "', codigo=" + codigo + "}";
	}
}
