import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Declaração de variáveis para armazenar os valores de x, y e o resultado
    float x = 0, y = 0, resultado = 0;
    // Variável para armazenar a opção escolhida pelo usuário
    int op;

    // Loop para continuar a execução do programa enquanto a opção for 1
    do {
      // Cria um objeto Scanner para ler input do usuário
      Scanner scan = new Scanner(System.in);

      // Imprime as opções disponíveis para o usuário
      System.out.println("Escolha uma das opções abaixo para calcular\n");
      System.out.println("\t1 - SOMA\n\t2 - SUBTRAÇÃO\n\t3 - MULTIPLICAÇÃO\n\t4 - DIVISÃO\n\t0- Sair\n\n");

      // Lê a opção escolhida pelo usuário
      op = scan.nextInt();

      // Se a opção for maior que 0 e menor que 5, lê os valores de x e y
      if (op > 0 && op < 5) {
        System.out.println("\nDigite o primeiro numero: ");
        x = scan.nextFloat();

        System.out.println("\nDigite o segundo numero: ");
        y = scan.nextFloat();
      }

      // Switch para verificar a opção escolhida pelo usuário
      // e realizar a operação correspondente
      switch (op) {
        case 0:
          System.out.println("Saindo...");
          // Pausa a execução do programa com o sleep
          try {
            Thread.sleep(9000000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          break;
        // case 1 é de soma
        case 1:
          resultado = x + y;
          System.out.println("\n\t O resultado é: " + resultado);
          break;
        // case 2 é de subtração
        case 2:
          resultado = x - y;
          System.out.println("\n\t O resultado é: " + resultado);
          break;
        // case 3 é de multiplicação
        case 3:
          resultado = x * y;
          System.out.println("\n\t O resultado é: " + resultado);
          break;
        // case 4 é de divisão
        case 4:
          resultado = x / y;
          System.out.println("\n\t O resultado é: " + resultado);
          break;

        default:
          System.out.println("\n Digite outra opção válida\n");
          break;
      }

      // Pergunta ao usuário se deseja continuar
      System.out.println("\n Digite 1 para continuar e 0 para sair: ");
      op = scan.nextInt();
    } while (op == 1);
  }
}
