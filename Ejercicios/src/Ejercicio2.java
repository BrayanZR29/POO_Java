public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("Ingrese un numero decimal:");
        double n = Utilidades.leerDecimal();

        if(n >= 0){
            System.out.println("Es positivo");
        }else{
            System.out.println("Es negativo");
        }

    }
}