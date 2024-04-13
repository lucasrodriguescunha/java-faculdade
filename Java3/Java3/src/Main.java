import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[] args) {
        final int NUM_ALUNOS = 5;
        Aluno[] objetoAluno = new Aluno[NUM_ALUNOS];
        JOptionPane.showMessageDialog(null, "C A D A S T R O    D E    A L U N O S");

        for (int i = 0; i < NUM_ALUNOS; i++) {
            JOptionPane.showMessageDialog(null, (NUM_ALUNOS - i) + " alunos para cadastrar." + (NUM_ALUNOS - 1 == 0 ?  "Não há mais" : "" ));

            String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ": ");
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da matricula: " + (i + 1) + ": "));
            double notaProva1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 1a prova: " + (i + 1) + ": "));
            double notaProva2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 2a prova: " + (i + 1) + ": "));
            double notaTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota tirada no trabalho: " + (i + 1) + ": "));

            objetoAluno[i] = new Aluno(matricula, nome, notaProva1, notaProva2, notaTrabalho);
            objetoAluno[i].calcularNota();
        }

        // Criação do modelo de tabela
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome: ");
        model.addColumn("Matrícula: ");
        model.addColumn("Nota 1a prova: ");
        model.addColumn("Nota 2a prova: ");
        model.addColumn("Nota do trabalho: ");

        // Preenchimento dos dados da tabela
        for (int i = 0; i < objetoAluno.length; i++) {
            model.addRow(new Object[]{
                    (i + 1),
                    objetoAluno[i].getNome(),
                    objetoAluno[i].getMatricula(),
                    objetoAluno[i].getNotaProva1(),
                    objetoAluno[i].getNotaProva2(),
                    objetoAluno[i].getNotaTrabalho()
            });
        }

        // Criação e exibição da tabela
        JTable table = new JTable(model);
        JOptionPane.showMessageDialog(null, new JScrollPane(table));
        }
    }
