import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }
    }

    static void validarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro (" + parametroDois + ") deve ser maior que o primeiro (" + parametroUm + ").");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        validarParametros(parametroUm, parametroDois);

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}