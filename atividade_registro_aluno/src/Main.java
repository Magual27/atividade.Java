import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Professor> professores = new ArrayList<>();
        List<Sala> salas = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        Integer id;
        int identificador;
        String nome;
        Integer numeroSala;
        Integer qtdAlunos;
        String materia;
        String nomeProcurado;
        int opcao;
        boolean keep = true;

        System.out.println("---Sistema da escola tal---");
        while (keep) {
            System.out.println("O que você deseja consultar?\n1- aluno\n2-Professor\n3-Sala\n4-Encerrar Sistema");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> {
                    opcao = 0;
                    System.out.println("O que você deseja fazer\n1-Adicionar aluno\n2-Consultar aluno\n3-Mostrar alunos cadastrados");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1 -> {
                            System.out.println("Digite um indentificador numerico para esse aluno ");
                            identificador = sc.nextInt();
                            System.out.println("Digite o nome do aluno");
                            nome = sc.next();
                            alunos.add(new Aluno(identificador, nome));
                        }
                        case 2 -> {
                            System.out.println("Digite o nome desse aluno");
                            nomeProcurado = sc.next();
                            for (Aluno a : alunos) {
                                if (a.nome.equals(nomeProcurado)) {
                                    System.out.println(a.toString());
                                }
                            }
                        }
                        case 3 -> {
                            for (Aluno a : alunos) {
                                System.out.printf("%06d %-14s \n", a.getId(), a.getNome());
                            }
                        }
                    }
                }
                case 2 -> {
                    opcao = 0;
                    System.out.println("O que você deseja fazer\n1-Adicionar professor\n2-Consultar professor\n3-Mostrar professores cadastrados");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1 -> {
                            System.out.println("Digite um indentificador numerico para esse professor ");
                            identificador = sc.nextInt();
                            System.out.println("Digite o nome do professor");
                            nome = sc.next();
                            System.out.println("Digite a materia do professor");
                            materia = sc.next();
                            professores.add(new Professor(identificador, nome, materia));
                        }
                        case 2 -> {
                            System.out.println("Digite o nome desse professor");
                            nomeProcurado = sc.next();
                            ;
                            for (Professor a : professores) {
                                if (a.nome.equals(nomeProcurado)) {
                                    System.out.println(a.toString());
                                }
                            }
                        }
                        case 3 -> {
                            for (Professor a : professores) {
                                System.out.printf("%06d %-14s \n", a.getId(), a.getNome());
                            }
                        }
                    }
                }
                case 3 -> {
                    opcao = 0;
                    System.out.println("O que você deseja fazer\n1-Adicionar sala\n2-Consultar sala\n3-Mostrar salas cadastrados");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1 -> {
                            System.out.println("Digite um indentificador numerico para essa sala ");
                            identificador = sc.nextInt();
                            System.out.println("Digite o numero da sala");
                            numeroSala = sc.nextInt();
                            System.out.println("Digite o nome da sala");
                            nome = sc.next();
                            System.out.println("Digite a quantidade de alunos na sala");
                            qtdAlunos = sc.nextInt();
                            salas.add(new Sala(identificador, numeroSala, nome, qtdAlunos));
                        }
                        case 2 -> {
                            System.out.println("Digite o nome da sala");
                            nomeProcurado = sc.next();
                            ;
                            for (Sala a : salas) {
                                if (a.nomeSala.equals(nomeProcurado)) {
                                    System.out.println(a.toString());
                                }
                            }
                        }
                        case 3 -> {
                            for (Sala a : salas) {
                                System.out.printf("%06d %-14s \n", a.getId(), a.getNomeSala());
                            }
                        }
                    }
                }
                default -> keep = false;
            }
        }
    }
}
