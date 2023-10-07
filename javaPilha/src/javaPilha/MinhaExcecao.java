package javaPilha;

public class MinhaExcecao extends Exception {
	//acima em exception esta na categoria checked, sao verificados pelo compilador
	public MinhaExcecao(String msg) {
		// super passa o atributo para classe mãe
		super(msg);
	}
}