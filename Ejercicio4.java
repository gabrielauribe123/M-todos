import javax.swing.*;

public class Ejercicio4 {
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        boolean resultado = esPar(10);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
