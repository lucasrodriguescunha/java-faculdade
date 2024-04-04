import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Solicitar ao usuário que insira os comprimentos dos lados do triângulo
        String lado1Input = JOptionPane.showInputDialog("Digite o comprimento do lado 1 do triângulo:");
        double lado1 = Double.parseDouble(lado1Input);

        String lado2Input = JOptionPane.showInputDialog("Digite o comprimento do lado 2 do triângulo:");
        double lado2 = Double.parseDouble(lado2Input);

        String lado3Input = JOptionPane.showInputDialog("Digite o comprimento do lado 3 do triângulo:");
        double lado3 = Double.parseDouble(lado3Input);

        // Criar o objeto Triangulo com os comprimentos dos lados fornecidos
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        // Calcular e exibir o tipo do triângulo, sua área e perímetro
        String mensagem = "Tipo: " + triangulo.tipoTriangulo() + "\n" +
                "Área: " + triangulo.calcularArea() + "\n" +
                "Perímetro: " + triangulo.calcularPerimetro();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
