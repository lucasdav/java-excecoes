package javaPilha;

public class FluxoExcecaoTryCatchPolimorfico {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		} 
        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        
        //abaixo lançando uma excecao
        throw new MinhaExcecao("deu errado");

        
        //System.out.println("Fim do metodo2");
    }
}
