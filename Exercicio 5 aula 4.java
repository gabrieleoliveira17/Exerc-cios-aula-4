import java.util.Scanner;

public class main {
    public static void main(String[] args);

    Scanner leia=new Scanner(System.in);

    double num1, num2, resultado;
    char opcao;

    System.out.println("Digite o primeiro numero: ");
    num1=leia.nextDouble();

    System.out.println("Digite o segundo numero: ");
    num2=leia.nextDouble();

    System.out.println("Escolha a operação:");
    System.out.println("M-Média");
    System.out.println("S-Diferença do maior pelo menor");
    System.out.println("P-Produto");
    System.out.println("D-Divisão");
    opcao=leia.next().charAt(0);

    switch(opcao) {

        case "M":
        case "m":
            resultado=(num1+num2)/2;
            System.out.println("Média: " + resultado);
            breack;

        case "S":
        case "s":
            if(num1 > num2) {
                resultado=num1-num2;
            } else {
                resultado=num2-num1;
            }
            System.out.println("Diferença: " + resultado);
            breack;

        case "P":
        case "p":
            resultado=num1*num2;
            System.out.println("Produto: " + resultado);

        case "D":
        case "d":
            resultado=num1/num2;
            System.out.println("Divisão: " + resultado);
            breack;

        default:
            System.out.println("Opção invalida");
        }
        leia.close();
    }