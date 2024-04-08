public class Funcionario {
    private String nome;
    private int departamento;
    private int horasTrabalhadas;
    private double salarioBase;
    private double horaExtra;
    private double insalubridade;
    private double bonificacao;
    private double inss;
    private double ir;
    private double planoSaude;
    private double salarioLiquido;

    // Construtor
    public Funcionario(String nome, int departamento, int horasTrabalhadas) {
        this.nome = nome;
        this.departamento = departamento;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public double getInsalubridade() {
        return insalubridade;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public double getInss() {
        return inss;
    }

    public double getIr() {
        return ir;
    }

    public double getPlanoSaude() {
        return planoSaude;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    // Método para calcular o salário
    public void calcularSalario() {
        double valorHora;
        if (departamento == 1)
            valorHora = 22.00;
        else
            valorHora = 12.00;

        salarioBase = horasTrabalhadas * valorHora;

        if (horasTrabalhadas > 40)
            horaExtra = valorHora * 2 * (horasTrabalhadas - 40);
        else
            horaExtra = 0;

        if (departamento == 2)
            insalubridade = salarioBase * 0.15;
        else
            insalubridade = 0;

        if (horasTrabalhadas > 20 && horasTrabalhadas <= 30)
            bonificacao = salarioBase * 0.03;
        else if (horasTrabalhadas > 30 && horasTrabalhadas < 40)
            bonificacao = salarioBase * 0.05;
        else if (horasTrabalhadas >= 40)
            bonificacao = salarioBase * 0.10;
        else
            bonificacao = 0;

        salarioLiquido = salarioBase + horaExtra + insalubridade + bonificacao;
        inss = salarioLiquido * 0.07;
        ir = salarioLiquido * 0.12;
        planoSaude = 20.00;
        salarioLiquido -= (inss + ir + planoSaude);
    }
}
