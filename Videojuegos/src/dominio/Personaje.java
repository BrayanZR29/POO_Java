package dominio;

import java.util.Scanner;

public class Personaje {
    public String alias;
    public String habilidad;
    public String armamento;
    public int cantVidas;


    public void leerDatos(){
        Scanner tecla = new Scanner(System.in);
        System.out.println(" -- Digite los datos del Personajes -- ");
        System.out.print(" -- Digite el alias : ");
        this.alias = tecla.nextLine();
        System.out.print(" -- Digite la habilidad :");
        this.habilidad = tecla.nextLine();
        System.out.print(" -- Digite el armamento : ");
        this.armamento = tecla.nextLine();
        System.out.print(" -- Digite la cantidad de vida : ");
        this.cantVidas = tecla.nextInt();

    }


    public void escribirDatos(){
        System.out.println("-- Personaje -- \n" +
                "- Alias: \n" + this.alias + "\n" +
                "- habilidad: " + this.habilidad + "\n" +
                "- Armamento: " + this.armamento + "\n" +
                "- Cantidad de vidas: " + this.cantVidas + "\n"
        );
    }

    public String getAlias() {
        return alias;
    }

    public String getArmamento() {
        return armamento;
    }

    public int getCantVidas() {
        return cantVidas;
    }

    public String getHabilidad() {
        return habilidad;
    }
}
