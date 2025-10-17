package repositorioGenerico;

public class Util extends Repositorio<String> {
	public static <T> void imprimir(T obj) {
		System.out.println(obj);
	}
}
