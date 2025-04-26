import java.util.Scanner;
import java.lang.Math;

public class CalculatorBeta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Calculadora Simples ===");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potência");
            System.out.println("6. Raiz Quadrada");
            System.out.println("7. Raiz Cúbica");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            if (opcao >= 1 && opcao <= 7) { /* Função que pede o valor
             do primeiro termo da opção 1 até a 7 */
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                double num2 = 0;
                if (opcao <= 5) { /* Extensão da função anterior; O
                segundo termo só é exigido caso a operação necessite (Operação 1 a 5) */
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                }

                switch (opcao) { // Switch Cases em operadores computacionais //
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break; // Soma dos termos //
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break; // Subtração dos termos //
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break; // Multiplicação dos termos //
                    case 4:
                        if (num2 != 0) { // Divisão de termos //
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Erro: Divisão por zero!");
                        } // Case 4.2: Se o termo 1 ou 2 for zero imprima erro //
                        break;
                    case 5:
                        System.out.println("Resultado: " + Math.pow(num1, num2));
                        break; /* Função importada para o produto do termo 1 repetida
                    x vezes, em que X = num2 */
                    case 6:
                        if (num1 >= 0) /* Função sqtr(import) que, para qualquer
                        número natural não nulo, seja encontrado sua raiz*/ {
                            System.out.println("Resultado: " + Math.sqrt(num1));
                        } else { /*Caso contrário (Natural nulo ou inteiro negativo): erro */
                            System.out.println("Erro: Raiz quadrada de número negativo!");
                        }
                        break;
                    case 7: /* cbrt função: solicita a raiz cúbica do termo primário
                    (quase a mesma coisa da case anterior */
                        System.out.println("Resultado: " + Math.cbrt(num1));
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } else {
                System.out.println("Opção inválida!");
            }
        } while (true);

        scanner.close();
    }
}