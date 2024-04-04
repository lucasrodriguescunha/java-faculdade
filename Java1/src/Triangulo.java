import java.lang.Math;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else if (Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2) ||
                Math.pow(lado2, 2) == Math.pow(lado1, 2) + Math.pow(lado3, 2) ||
                Math.pow(lado3, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2)) {
            return "Triângulo Retângulo";
        } else {
            return "Escaleno";
        }
    }
}
