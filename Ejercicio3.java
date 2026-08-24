import javax.swing.*;

public class Ejercicio3 {
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
    public static void main(String[] args) {
        double area = calcularAreaRectangulo(5, 3);
        JOptionPane.showMessageDialog(null,"El área es: " + area);
    }
}
