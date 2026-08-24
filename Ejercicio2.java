import javax.swing.*;

public class Ejercicio2 {
   public static void saludarEstudiante(String nombre, int edad) {
       JOptionPane.showMessageDialog(null, "Holiii " + nombre + edad + "años. ");
   }
   public static void main(String[] args) {
       saludarEstudiante("Gabriela ", 17);
   }
}
