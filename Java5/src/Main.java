public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Hora
        Hora hora1 = new Hora(12, 30, 45);
        Hora hora2 = new Hora(8, 15, 20);

        // Exibindo as horas
        System.out.println("Hora 1: " + hora1.displayHora());
        System.out.println("Hora 2: " + hora2.displayHora());

        // Comparando as horas
        int diferencaSegundos = hora1.compara(hora2);
        if (diferencaSegundos == 0) {
            System.out.println("As horas são iguais.");
        } else {
            System.out.println("Diferença em segundos: " + diferencaSegundos);
        }
    }
}
