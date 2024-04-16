public class Main {
    public static void main(String[] args) {
        // Criando uma data para o voo
        Data dataVoo = new Data(15, 4, 2024);

        // Criando um objeto Voo
        Voo voo = new Voo(123, dataVoo);

        // Verificando e ocupando assentos
        System.out.println("Próximo assento livre: " + voo.proximoLivre());
        System.out.println("Ocupando assento 5: " + voo.ocupa(5));
        System.out.println("Verificando assento 5: " + voo.verifica(5));
        System.out.println("Vagas disponíveis: " + voo.vagas());

        // Exibindo informações do voo
        System.out.println("Número do voo: " + voo.getVoo());
        System.out.println("Data do voo: " + voo.getData().getDia() + "/" + voo.getData().getMes() + "/" + voo.getData().getAno());
    }
}
