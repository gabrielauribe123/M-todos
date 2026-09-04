import javax.swing.*;
import java.util.ArrayList;
public class Ejercicio10 {
    public static void main(String[] args){
        ArrayList<Producto> productos= new ArrayList<>();

        agregarProducto(productos, "Arroz", 5000, 10);
        agregarProducto(productos, "Leche", 4000, 5);
        agregarProducto(productos, "Pan", 3000, 8);

        System.out.println("===INVENTARIO===");

        mostrarInventario(productos);

        double total = calcularValorTotalInventario(productos);

        System.out.println("___");
        System.out.println("Valor total: $" + total);
    }
    public static void agregarProducto(
            ArrayList<Producto> productos,
            String nombre,
            double precio,
            int cantidad){

        Producto nuevoProducto = new Producto(nombre, precio, cantidad);
        productos.add(nuevoProducto);
    }
    public static double calcularValorTotalInventario(ArrayList<Producto> productos){

        double total = 0;

        for (Producto producto : productos){
            total = total + (producto.precio * producto.cantidad);
        }
        return total;
    }
    public static void mostrarInventario(ArrayList<Producto> productos){

        for (Producto producto : productos){
            System.out.println(
                    "Producto:" + producto.nombre +
                            " | Precio: $" + producto.precio +
                            " | Cantidad:" + producto.cantidad
            );
        }
    }
}
class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre =nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
