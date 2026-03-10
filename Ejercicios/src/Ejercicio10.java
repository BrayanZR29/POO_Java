public class Ejercicio10 {

    public static void main(String[] args) {

        System.out.println("Ingrese valor de la venta:");
        double venta = Utilidades.leerDecimal();

        double iva = venta * 0.19;

        double total = venta + iva;

        double descuento;

        if(venta > 150000){
            descuento = total * 0.25;
        }else{
            descuento = total * 0.10;
        }

        double pagar = total - descuento;

        System.out.println("IVA: " + iva);
        System.out.println("Total con IVA: " + total);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + pagar);

    }
}