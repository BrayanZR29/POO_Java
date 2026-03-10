package dominio;

import java.util.Scanner;

public class Juegos {
    public String nombre; //mortal kombat
    public String estilo;
    public String calidad;
    public String acceso;
    public double version = 1.0;
    public static final String FRABICANTE = "Midway Games";

    public void leerDatos(){
        Scanner tecla = new Scanner(System.in);
        System.out.println(" -- Digite los datos del juegos -- ");
        System.out.print(" -- Digite el nombre : ");
        this.nombre = tecla.nextLine();
        System.out.print(" -- Digite el estilo de juego : ");
        this.estilo = tecla.nextLine();
        System.out.print(" -- Digite el calidad : ");
        this.calidad = tecla.nextLine();
        System.out.print(" -- Digite el modo de juego :");
        this.acceso = tecla.nextLine();
    }

    public void escribirDatos(){
        System.out.println("-- Juego -- \n" +
                "- Nombre: \n" + this.nombre + "\n" +
                "- Estilo: " + this.estilo + "\n" +
                "- Calidad: " + this.calidad + "\n" +
                "- Modo: " + this.acceso + "\n"
        );
    }

    public double getVersion() {
        return version;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCalidad() {
        return calidad;
    }

    public String getAcceso() {
        return acceso;
    }

}
