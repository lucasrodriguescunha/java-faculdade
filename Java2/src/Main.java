import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[] args) {
        final int NUM_USUARIOS = 5;
        Funcionario[] funcionarios = new Funcionario[NUM_USUARIOS];
        JOptionPane.showMessageDialog(null, "---------------------- CADASTRO ----------------------");

        for (int i = 0; i < NUM_USUARIOS; ++i) {
            JOptionPane.showMessageDialog(null, (NUM_USUARIOS - i) + " usuários para cadastrar." + (NUM_USUARIOS - 1 == 0 ? " Não há mais" : ""));

            String nome = JOptionPane.showInputDialog("Digite o nome do funcionário " + (i + 1) + ": ");
            int departamento = getIntegerInput("Digite o departamento (1 - Administrativo / 2 - Produção) do funcionário " + (i + 1) + ": ");
            int horasTrabalhadas = getIntegerInput("Digite a quantidade de horas trabalhadas pelo funcionário " + (i + 1) + ": ");

            funcionarios[i] = new Funcionario(nome, departamento, horasTrabalhadas);
            funcionarios[i].calcularSalario();
        }

        // Criação do modelo de tabela
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Ordem");
        model.addColumn("Nome");
        model.addColumn("Salario base");
        model.addColumn("Hora Extra");
        model.addColumn("Insalubridade");
        model.addColumn("Bonificacao");
        model.addColumn("INSS");
        model.addColumn("IR");
        model.addColumn("Plano Saude");
        model.addColumn("Salario Liquido");

        // Preenchimento dos dados da tabela
        for (int i = 0; i < funcionarios.length; ++i) {
            model.addRow(new Object[]{
                    (i + 1),
                    funcionarios[i].getNome(),
                    funcionarios[i].getSalarioBase(),
                    funcionarios[i].getHoraExtra(),
                    funcionarios[i].getInsalubridade(),
                    funcionarios[i].getBonificacao(),
                    funcionarios[i].getInss(),
                    funcionarios[i].getIr(),
                    funcionarios[i].getPlanoSaude(),
                    funcionarios[i].getSalarioLiquido()
            });
        }

        // Criação e exibição da tabela
        JTable table = new JTable(model);
        JOptionPane.showMessageDialog(null, new JScrollPane(table));
    }

    // Método para obter entrada de inteiro com tratamento de exceção
    private static int getIntegerInput(String message) {
        int value = 0;
        boolean validInput = false;
        while (!validInput) {
            String input = JOptionPane.showInputDialog(message);
            if (input != null && !input.isEmpty()) {
                try {
                    value = Integer.parseInt(input);
                    validInput = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor inteiro válido.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor inteiro válido.");
            }
        }
        return value;
    }
}
