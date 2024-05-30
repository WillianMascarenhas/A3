import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        inicializarFuncionarios();
        menu();
    }

    private static void inicializarFuncionarios() {
        funcionarios.add(new Funcionario("Alice", 1, "RH", 3000, "01/01/2020"));
        funcionarios.add(new Funcionario("Bob", 2, "TI", 4000, "01/02/2020"));
        funcionarios.add(new Funcionario("Carlos", 3, "Financeiro", 3500, "01/03/2020"));
        funcionarios.add(new Funcionario("Diana", 4, "Marketing", 3200, "01/04/2020"));
        funcionarios.add(new Funcionario("Eduardo", 5, "Operações", 2800, "01/05/2020"));
        funcionarios.add(new Funcionario("Fernanda", 6, "Vendas", 2900, "01/06/2020"));
        funcionarios.add(new Funcionario("Gustavo", 7, "Logística", 3100, "01/07/2020"));
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Buscar Funcionário");
            System.out.println("4. Remover Funcionário");
            System.out.println("5. Modificar Funcionário");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario(scanner);
                    break;
                case 2:
                    listarFuncionarios(scanner);
                    break;
                case 3:
                    buscarFuncionario(scanner);
                    break;
                case 4:
                    removerFuncionario(scanner);
                    break;
                case 5:
                    modificarFuncionario(scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private static void cadastrarFuncionario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Departamento: ");
        String departamento = scanner.next();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Data de Admissão: ");
        String dataAdmissao = scanner.next();

        Funcionario novoFuncionario = new Funcionario(nome, id, departamento, salario, dataAdmissao);
        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void listarFuncionarios(Scanner scanner) {
        System.out.println("Escolha o critério de ordenação:");
        System.out.println("1. ID");
        System.out.println("2. Nome");
        System.out.println("3. Departamento");
        int criterio = scanner.nextInt();

        switch (criterio) {
            case 1:
                funcionarios.sort(Comparator.comparingInt(Funcionario::getId));
                break;
            case 2:
                funcionarios.sort(Comparator.comparing(Funcionario::getNome));
                break;
            case 3:
                funcionarios.sort(Comparator.comparing(Funcionario::getDepartamento));
                break;
            default:
                System.out.println("Critério inválido!");
                return;
        }

        System.out.println("Funcionários:");
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            System.out.println(f);
        }
    }

    private static void buscarFuncionario(Scanner scanner) {
        System.out.print("Digite o ID do funcionário: ");
        int id = scanner.nextInt();

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getId() == id) {
                System.out.println("Funcionário encontrado:");
                System.out.println("Nome: " + f.getNome());
                System.out.println("ID: " + f.getId());
                System.out.println("Departamento: " + f.getDepartamento());
                System.out.println("Salário: " + f.getSalario());
                System.out.println("Data de Admissão: " + f.getDataAdmissao());
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    private static void removerFuncionario(Scanner scanner) {
        System.out.print("Digite o ID do funcionário a ser removido: ");
        int id = scanner.nextInt();

        Funcionario funcionarioARemover = null;
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getId() == id) {
                funcionarioARemover = f;
                break;
            }
        }

        if (funcionarioARemover != null) {
            System.out.println("Funcionário encontrado: " + funcionarioARemover);
            System.out.print("Confirma a remoção? (s/n): ");
            String confirmacao = scanner.next();

            if (confirmacao.equalsIgnoreCase("s")) {
                funcionarios.remove(funcionarioARemover);
                System.out.println("Funcionário removido com sucesso.");
            } else {
                System.out.println("Remoção cancelada.");
            }
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void modificarFuncionario(Scanner scanner) {
        System.out.print("Digite o ID do funcionário a ser modificado: ");
        int id = scanner.nextInt();

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getId() == id) {
                System.out.println("Funcionário encontrado: " + f);
                System.out.print("Novo Nome: ");
                String nome = scanner.next();
                System.out.print("Novo Departamento: ");
                String departamento = scanner.next();
                System.out.print("Novo Salário: ");
                double salario = scanner.nextDouble();
                System.out.print("Nova Data de Admissão: ");
                String dataAdmissao = scanner.next();

                f.setNome(nome);
                f.setDepartamento(departamento);
                f.setSalario(salario);
                f.setDataAdmissao(dataAdmissao);

                System.out.println("Funcionário modificado com sucesso.");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }
}
