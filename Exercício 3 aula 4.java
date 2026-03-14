import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char variavel;

        System.out.print("Digite o periodo (M - Matutino, V - Vespertino, N - Noturno): ");
        variavel = scanner.next().charAt(0);

        switch (variavel) {

            case 'M':
                System.out.println("bom dia");
                break;

            case 'V':
                System.out.println("boa tarde");
                break;

            case 'N':
                System.out.println("boa noite");
                break;

            default:
                System.out.println("Opcao invalida");
        }

        scanner.close();
    }
}
