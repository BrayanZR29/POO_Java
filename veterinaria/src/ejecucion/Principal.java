package ejecucion;

import animales.Mascotas;
import facturacion.Factura;

public class Principal {

    public static void main(String[] args) {
        Factura factura = new Factura();
        Mascotas animal = new Mascotas("perro", 2, "chandoso");

        animal.mostrarInfo();
        factura.ImprimeFactura(animal);
    }

}
