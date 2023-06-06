import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nome_prof;
        String materia_prof;
        double preco;
        double qtdHoras;
        double total;

        System.out.println("Bem vindo ao sistema da escola tal");

        Scanner eumesmo = new Scanner(System.in);

        System.out.println("Insira o nome do professor:");
        nome_prof = eumesmo.next();

        System.out.println("Insira a matéria do professor:");
        materia_prof = eumesmo.next();

        System.out.println("Insira o preço por hora:");
        preco = eumesmo.nextDouble();

        System.out.println("Insira a quantidade de horas que o professor ira atuar hoje :");
        qtdHoras = eumesmo.nextDouble();

        total = preco * qtdHoras;

        System.out.println("-------Resultado do Registro-------");

        System.out.println("Professor: " + nome_prof + " | Matéria: " + materia_prof + " | preço: " + preco);
        System.out.println("O professor " + nome_prof + " vai ganhar " + total + ", trabalhando por " + qtdHoras + " horas.");

    }
}