class Aluno {
    // Atributos
    private String nome;
    private int matricula;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    // Construtor
    public Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    // Método para calcular a nota total
    public double notaTotal() {
        return (notaProva1 + notaProva2) * 0.3 + notaTrabalho * 0.4;
    }

    // Método para verificar se o aluno foi aprovado
    public boolean isAprovado() {
        return notaTotal() >= 6.0;
    }
}