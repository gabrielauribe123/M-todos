import javax.swing.*;

public class Ejercicio8 {
        public static int[] generarTablaMultiplicar(int num) {
            int[] tabla = new int[10];
            for (int i = 0; i < 10; i++) {
                tabla[i] = num * (i + 1);
            }
            return tabla;
        }
        public static void main(String[] args) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para generar su tabla: "));
            int[] resultado = generarTablaMultiplicar(num);
            String mensaje = "Tabla del " + num + "\n\n";
            for (int i = 0; i < resultado.length; i++) {
                mensaje += num + " x " + (i + 1) + " = " + resultado[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

