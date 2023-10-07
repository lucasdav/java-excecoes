package javaPilha;

public class FluxoExcecao {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
            	int a = i / 0;
			} catch (ArithmeticException ex) {
				String msg = ex.getMessage();
				System.out.println("ArithmeticException" + msg);
				//abaixo imprime onde ocorreu o erro
				ex.printStackTrace();
			}
            
        }
        System.out.println("Fim do metodo2");
    }
}
