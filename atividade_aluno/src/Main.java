import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(1,"Jhamal", "1°D");

        Scanner leitor = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("-------Calculadora-------");

        System.out.print("Insira o 1° número: ");
        n1 = leitor.nextDouble();

        System.out.print("Insira o 2° número: ");
        n2 = leitor.nextDouble();

        System.out.println("-------Selecione alguma das opcões-------");
        System.out.println("1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão\n5 - tabuada");
        System.out.print("---> ");
        int res = leitor.nextInt();

        if (res == 1) {
            System.out.print("resultado -> ");
            aluno1.soma(n1, n2);
        } else if (res == 2) {
            System.out.print("resultado -> ");
            aluno1.sub(n1, n2);
        } else if (res == 3) {
            System.out.print("resultado -> ");
            aluno1.multi(n1, n2);
        } else if (res == 4) {
            System.out.print("resultado -> ");
            aluno1.div(n1, n2);
        } else if (res == 5) {
            System.out.println("---resultado---");
            aluno1.calcTabuada((int) n1);
        }

    }

}