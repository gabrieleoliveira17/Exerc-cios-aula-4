import java.util.Scanner;

public class {
    public void static void main(String[] args) {

        Scanner leia=new Scanner(System.in);

        int codigo, quantidade;
        double preco=0, total;
        String produto="";

        System.out.println("Digite o código do produto: ");
        codigo=leia.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade=leia.nextInt();

        switch(codigo) {
            case 100:
                produto="Cachorro Quente";
                preco=1.20;
                breack;
            
            case 101:
                produto="Bauru Simples";
                preco=1.30
                breack;

            case 102:
            produto="Bauru com ovo";
            preco=1.50
            breack;

            case 103:
            produto="Hambúrguer";
            preco=1.20;
            breack;

            case 104:
                produto="Cheeseburguer";
                preco=1.30;
                breack;
            
            case 105:
                produto="Refrigerante";
                preco=1.00;
                breack;

            default:
                System.out.println("Código inválido")
                return;
        }

        total=preco*quantidade;

        System.out.println("Produto: " + produto);
        System.out.println("Total a pagar: R$ " + total);

        leia.close();
    }
}