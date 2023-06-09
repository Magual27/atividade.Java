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
            System.out.print("O que você deseja consultar?\n1 - aluno\n2 - Professor\n3 - Sala\n4 - Encerrar Sistema\n---> ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> {
                    opcao = 0;
                    System.out.print("O que você deseja fazer? \n1 - Adicionar aluno\n2 - Consultar aluno\n3 - Mostrar alunos cadastrados\n---> ");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1 -> {
                            System.out.print("Digite um indentificador numerico para esse aluno\n---> ");
                            identificador = sc.nextInt();
                            System.out.print("Digite o nome do aluno\n---> ");
                            nome = sc.next();
                            alunos.add(new Aluno(identificador, nome));
                        }
                        case 2 -> {
                            System.out.print("Digite o nome desse aluno\n---> ");
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
                    System.out.print("O que você deseja fazer? \n1 - Adicionar professor\n2 - Consultar professor\n3 - Mostrar professores cadastrados\n---> ");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1 -> {
                            System.out.print("Digite um indentificador numerico para esse professor\n---> ");
                            identificador = sc.nextInt();
                            System.out.print("Digite o nome do professor\n---> ");
                            nome = sc.next();
                            System.out.print("Digite a materia do professor\n---> ");
                            materia = sc.next();
                            professores.add(new Professor(identificador, nome, materia));
                        }
                        case 2 -> {
                            System.out.print("Digite o nome desse professor\n---> ");
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
                    System.out.print("O que você deseja fazer ?\n1 - Adicionar sala\n2 - Consultar sala\n3 - Mostrar salas cadastrados\n---> ");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1 -> {
                            System.out.print("Digite um indentificador numerico para essa sala\n---> ");
                            identificador = sc.nextInt();
                            System.out.print("Digite o numero da sala\n---> ");
                            numeroSala = sc.nextInt();
                            System.out.print("Digite o nome da sala\n---> ");
                            nome = sc.next();
                            System.out.print("Digite a quantidade de alunos na sala\n---> ");
                            qtdAlunos = sc.nextInt();
                            salas.add(new Sala(identificador, numeroSala, nome, qtdAlunos));
                        }
                        case 2 -> {
                            System.out.print("Digite o nome da sala\n---> ");
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
                default -> {
                    keep = false;
                    System.out.println("---Fim do programa---");
                }
            }
        }
    }
}
