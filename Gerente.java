// Classe Gerente que herda de Funcionario
public class Gerente extends Funcionario {
    // Atributos específicos da classe Gerente
    private String setor;
    private double bonus;

    // Construtor da classe Gerente que chama o construtor da classe pai (Funcionario)
    public Gerente(String nome, int id, String departamento, double salario, String dataAdmissao, String setor, double bonus) {
        super(nome, id, departamento, salario, dataAdmissao);  // Chamada ao construtor da classe pai
        this.setor = setor;
        this.bonus = bonus;
    }

    // Métodos Getters e Setters para os atributos específicos de Gerente
    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    // Método toString que adiciona informações do setor e bônus à representação de string do Gerente
    @Override
    public String toString() {
        return super.toString() + String.format(" | %s | %.2f", setor, bonus);
    }
}
