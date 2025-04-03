import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva o primeiro parametro: ");
        int parametroUm = scan.nextInt();
        System.out.println("Escreva o Segundo parametro: ");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
           System.err.println("Erro: "+ e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        for (int cont = 1; cont <= contagem; cont++) {
            System.out.println("IMPRIMINDO O NUMERO " + cont);
        }

    }

    private static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String s) {
            super(s);
        }
    }
}
