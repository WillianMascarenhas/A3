public class Gerente extends Funcionario {
    private String setor;
    private double bonus;

    public Gerente(String nome, int id, String departamento, double salario, String dataAdmissao, String setor, double bonus) {
        super(nome, id, departamento, salario, dataAdmissao);
        this.setor = setor;
        this.bonus = bonus;
    }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Setor: %s | Bônus: %.2f", setor, bonus);
    }
}
