import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero real: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero real: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, /, ^): ");
        String operacao = scanner.next();

        double resultado;
        boolean operacaoValida = true;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                System.out.printf("Resultad   .f\n", resultado);
                break;
                
            case "-":
                
                resultado = numero1 - numero2;
                System.out.printf("Resultado: %.4f\n", resultado);
                break;
            case "*":
                
                resultado = numero1 * numero2;
                System.out.printf("Resultado: 4f\n", resultado);
                break;
            case "/":
                if (numero2 == 0) {
                    System.out.println("Erro: divisão por zero não e permitida.");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("Resultado: %.4f\n", resultado);
                }
                break;
            case "^":
                resultado = Math.pow(numero1, numero2);
                System.out.printf("Resultado: %.4f\n", resultado);
                
                break;
            default:
                operacaoValida = false;
                System.out.println("Erro: símbolo da operação inválido.");
        }

        scanner.close();
    }
}