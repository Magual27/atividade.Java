public class Aluno {

    private Integer id;

    private String name;

    private String serie;

    public Aluno(Integer id, String name, String serie) {
        this.id = id;
        this.name = name;
        this.serie = serie;
    }

    public void soma(double n1, double n2) {

        double res = n1 + n2;
        System.out.println(res);

    }

    public void sub(double n1, double n2) {

        double res = n1 - n2;
        System.out.println(res);

    }

    public void multi(double n1, double n2) {

        double res = n1 * n2;
        System.out.println(res);

    }

    public void div(double n1, double n2) {

        double res = n1 / n2;
        System.out.println(res);

    }

    public void calcTabuada(int n1) {

        int i = 0;

        while(i < 10) {

            i++;
            int res = n1 * i;

            System.out.println(n1 + " x " + i + " = " + res);

        }

    }

}
