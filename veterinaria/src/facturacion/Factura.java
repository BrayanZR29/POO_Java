package facturacion;
import animales.Mascotas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Factura {
    LocalDateTime ahora = LocalDateTime.now();
    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatoHora  = DateTimeFormatter.ofPattern("hh:mm:ss");

    String fecha = ahora.format(formatoFecha);
    String hora  = ahora.format(formatoHora);
    public void ImprimeFactura(Mascotas m){
        System.out.println("\n ---- Factura ----" +
                "\n\n fecha : "+ fecha +
                "\n hora  : "+ hora +
                "\n perro : " + m.getNombre() +
                "\n edad  : " + m.getEdad() +
                "\n raza  : " + m.getRaza());
    }
}
