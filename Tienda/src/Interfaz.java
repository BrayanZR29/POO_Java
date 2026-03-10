
import java.util.Scanner;

public class Interfaz {
    Inventario datos = new Inventario(); // Trae el almacén
    Acciones tareas = new Acciones();    // Trae las funciones
    Scanner entrada = new Scanner(System.in);

    public void iniciar() {
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\nMENU TIENDA:");
            System.out.println("1. Registrar producto");
            System.out.println("2. Ver inventario");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            if (opcion == 1) tareas.registrarNuevo(datos.productos, entrada);
            if (opcion == 2) tareas.mostrarTodo(datos.productos);
        }
        System.out.println("Programa finalizado.");
    }
}
