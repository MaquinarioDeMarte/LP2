package repositorioGenerico;

public class Par<K, V> extends Repositorio<String> {
	private K chave;
	private V valor;
	
	public Par(K chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
	    return "Par{chave='" + chave + "', valor=" + valor + "}";
	}
}
