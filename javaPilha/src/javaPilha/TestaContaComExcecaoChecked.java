package javaPilha;

public class TestaContaComExcecaoChecked {
	
	public static void main(String[] args) {
		
		ContaComExcecao c = new ContaComExcecao();
		try {
			c.deposita();
		} catch (Exception e) {
			System.out.println("tratamento ....");
		}
	}
}
