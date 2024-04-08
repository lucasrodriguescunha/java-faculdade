public class FolhaPagamento {
    public static void imprimirFolha(Funcionario[] funcionarios) {
        System.out.printf("%-5s%-20s%-15s%-15s%-15s%-15s%-10s%-10s%-15s%-15s\n", "Ordem", "Nome", "Salario base", "Hora Extra",
                "Insalubridade", "Bonificacao", "INSS", "IR", "Plano Saude", "Salario Liquido");

        for (int i = 0; i < funcionarios.length; ++i) {
            System.out.printf("%-5d%-20s%-15.2f%-15.2f%-15.2f%-15.2f%-10.2f%-10.2f%-15.2f%-15.2f\n",
                    (i + 1), funcionarios[i].getNome(), funcionarios[i].getSalarioBase(),
                    funcionarios[i].getHoraExtra(), funcionarios[i].getInsalubridade(),
                    funcionarios[i].getBonificacao(), funcionarios[i].getInss(),
                    funcionarios[i].getIr(), funcionarios[i].getPlanoSaude(),
                    funcionarios[i].getSalarioLiquido());
        }
    }
}
