public class Voo {
    private int numeroVoo;
    private Data dataVoo;
    private boolean[] assentos;

    public Voo(int numeroVoo, Data dataVoo) {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
        this.assentos = new boolean[100]; // Inicializa todos os assentos como livres
    }

    public int proximoLivre() {
        for (int i = 0; i < assentos.length; i++) {
            if (!assentos[i]) {
                return i + 1; // Assentos são numerados a partir de 1
            }
        }
        return -1; // Retorna -1 se não houver assentos livres
    }

    public boolean verifica(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            return false; // Número de assento inválido
        }
        return assentos[numeroCadeira - 1]; // Retorna true se ocupado, false se livre
    }

    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            return false; // Número de assento inválido
        }
        if (!assentos[numeroCadeira - 1]) {
            assentos[numeroCadeira - 1] = true;
            return true; // Assento estava livre, ocupou com sucesso
        }
        return false; // Assento já estava ocupado
    }

    public int vagas() {
        int vagas = 0;
        for (boolean assento : assentos) {
            if (!assento) {
                vagas++;
            }
        }
        return vagas;
    }

    public int getVoo() {
        return numeroVoo;
    }

    public Data getData() {
        return dataVoo;
    }
}
