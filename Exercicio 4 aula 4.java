import java.util.Scanner;

public class main {
    public static void main(String[] args);

    Scanner leia=new Scanner(System.in);

    char plano;
    double salario, novoSalario;

    System.out.println("Digite o plano de trabalho (A, B ou C): ");
    plano=leia.next().charAt(0);

    System.out.println("Digite o salario atual: ");
    salario=leia.nextDouble();

    switch(plano) {
        case "A":
        case "a":
            novoSalario=salario+(salario*0.10);
            System.out.println("Novo salario: "+ novoSalario);
            breack;

        case "B":
        case "b":
            novoSalario=salario+(salario*0.15);
            System.out.println("Novo salario: "+ novoSalario);
            breack;

        case "C":
        case "c":
            novoSalario=salario+(salario*0.20);
            System.out.println("Novo salario: "+ novoSalario);
            breack;

        default:
            System.out.println("Plano inavalido");

        leia.close;
    }
}