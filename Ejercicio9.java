import javax.swing.*;

public class Ejercicio9 {
        public static String clasificarNota(double nota) {
            if (nota < 60) {
                return "Reprobado";
            }else if (nota < 80) {
                return "Aprobado";
            }else {
                return "Excelente";
            }
        }
        public static void main(String[] args) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante: "));
            String resultado = clasificarNota(nota);
            JOptionPane.showMessageDialog(null, "Nota: " + nota + "\nResultado: " + resultado);
        }
    }

