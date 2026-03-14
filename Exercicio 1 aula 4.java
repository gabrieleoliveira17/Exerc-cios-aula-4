import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {

    System.out.println("===== Dia da Semana ======");
    System.out.println("1-Domingo");
    System.out.println("2-Segunda-feira");
    System.out.println("3-Terça-feira");
    System.out.println("4-Quarta-feira");
    System.out.println("5-Quinta-feira");
    System.out.println("6-Sexta-feira");
    System.out.println("7-Sabado");

    Scanner entrada=new Scanner(System.in);
    int dia=entrada.nextInt();

    switch (dia) {
        case 1:
            System.out.println("Domingo");
            breack;

        case 2:
            System.out.println("Segunda-feira");
            breack;

        case 3:
            System.out.println("Terça-feira");
            breack;

        case 4:
            System.out.println("Quarta-feira");
            breack;

        case 5:
            System.out.println("Quinta-feira");
            breack;

        case 6:
            System.out.println("Sexta-feira");
            breack;

        case 7:
            System.out.println("Sabado");
            breack;

        default:
            System.out.println("Numero invalido");

    }
    
    entrada.close();


    }
}