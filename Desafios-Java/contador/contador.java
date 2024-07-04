package contador;

import java.util.Scanner;

// Classe principal onde o programa começa
public class contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); // Cria um objeto para ler a entrada do usuário

        // Pede ao usuário para digitar o primeiro número
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Lê o primeiro número digitado pelo usuário

        // Pede ao usuário para digitar o segundo número
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Lê o segundo número digitado pelo usuário

        try {
            // Tenta contar do primeiro número até o segundo
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Se o segundo número for menor que o primeiro, mostra uma mensagem de erro
            System.out.println(exception.getMessage());
        }

        terminal.close(); // Fecha o objeto Scanner
    }

    // Método que faz a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Se o primeiro número for maior que o segundo, lança uma exceção com a mensagem de erro
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm; // Calcula a diferença entre os dois números

        // Faz um loop para contar do primeiro número até a diferença calculada
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i); // Imprime cada número
        }
    }
}

// Classe para criar a exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message); // Passa a mensagem de erro para a classe pai (Exception)
    }
}
