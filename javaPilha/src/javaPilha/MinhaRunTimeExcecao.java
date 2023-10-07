package javaPilha;

public class MinhaRunTimeExcecao extends RuntimeException {
	// acima RunTimeException está na categoria unchecked, nao sao verificados pelo compilador
	public MinhaRunTimeExcecao(String msg) {
		// super passa o atributo para classe mãe
		super(msg);
	}
}
