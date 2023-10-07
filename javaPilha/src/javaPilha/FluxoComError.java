package javaPilha;

public class FluxoComError {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaRunTimeExcecao e) {
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		} 
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
    	// nesse caso cai na hierarquia de Erros da maquina virtual devido exceder a memoria
    	System.out.println("ini do metodo 2");
    	metodo2();
    	System.out.println("fim do metodo 2");
    }
}
