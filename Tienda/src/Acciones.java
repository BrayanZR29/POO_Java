
import java.util.Map;
import java.util.Scanner;

public class Acciones {

    public void mostrarTodo(Map<String, Double> lista) {
        System.out.println("\n--- LISTA DE PRECIOS ---");
        for (Map.Entry<String, Double> fila : lista.entrySet()) {
            System.out.println(fila.getKey() + " > $" + fila.getValue());
        }
    }

    public void registrarNuevo(Map<String, Double> lista, Scanner lector) {
        System.out.print("Nombre del producto: ");
        String nombre = lector.next();
        System.out.print("Precio: ");
        double precio = lector.nextDouble();

        lista.put(nombre, precio); // Aquí se guarda en el diccionario
        System.out.println("¡Registrado con éxito!");
    }
}
