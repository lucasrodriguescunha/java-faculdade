public class NumeroInteiro {
    private int numero;

    // Construtor sem parâmetros
    public NumeroInteiro() {
        this.numero = 0;
    }

    // Segundo construtor com parâmetro
    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    // Método para somar outro número
    public void soma(int outroNumero) {
        this.numero += outroNumero;
    }

    // Método para subtrair outro número
    public void subtrai(int outroNumero) {
        this.numero -= outroNumero;
    }

    // Método para verificar se o número é primo
    public boolean isPrimo() {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para obter o próximo número primo
    public int getNextPrimo() {
        int next = numero + 1;
        while (!isPrimo(next)) {
            next++;
        }
        return next;
    }

    // Método auxiliar para verificar se um número é primo
    private boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Getter para obter o número representado
    public int getNumero() {
        return numero;
    }

    // Setter para definir o número representado
    public void setNumero(int numero) {
        this.numero = numero;
    }
}