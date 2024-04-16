public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe
        NumeroInteiro num = new NumeroInteiro(5);
        System.out.println("Número: " + num.getNumero());
        System.out.println("É primo? " + num.isPrimo());
        System.out.println("Próximo primo: " + num.getNextPrimo());
        num.soma(3);
        System.out.println("Após somar 3: " + num.getNumero());
        num.subtrai(2);
        System.out.println("Após subtrair 2: " + num.getNumero());

    }
}