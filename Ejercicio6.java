import javax.swing.*;

public class Ejercicio6 {
    double nota;
    public void mostrarBoletin() {
        JOptionPane.showMessageDialog(null, "Nota del estudiante: " + this.nota);
    }
    public static double compararNotas(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}

