public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(15, 4, 2024);
        Data data2 = new Data(20, 4, 2024);

        System.out.println("Data 1: " + data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno());
        System.out.println("Data 2: " + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());
        System.out.println("Compara: " + data1.compara(data2));  // Saída: -1 (data1 é anterior a data2)
        System.out.println("Mês por extenso: " + data1.getMesExtenso());  // Saída: abril
    }
}
