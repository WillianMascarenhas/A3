// Classe Funcionario
public class Funcionario {
    // Atributos privados da classe
    private String nome;
    private int id;
    private String departamento;
    private double salario;
    private String dataAdmissao;

    // Construtor para inicializar os atributos da classe
    public Funcionario(String nome, int id, String departamento, double salario, String dataAdmissao) {
        this.nome = nome;
        this.id = id;
        this.departamento = departamento;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    // Métodos Getters e Setters para acessar e modificar os atributos privados
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(String dataAdmissao) { this.dataAdmissao = dataAdmissao; }

    // Método toString para representar o objeto Funcionario como uma string
    @Override
    public String toString() {
        return String.format("%s | %d | %s", nome, id, departamento);
    }
}
