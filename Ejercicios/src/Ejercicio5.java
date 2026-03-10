public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("Ingrese año de nacimiento:");
        int anio = Utilidades.leerEntero();

        System.out.println("Ingrese mes:");
        int mes = Utilidades.leerEntero();

        System.out.println("Ingrese dia:");
        int dia = Utilidades.leerEntero();

        int edad = Utilidades.calcularEdad(anio, mes, dia);

        System.out.println("Edad: " + edad);

    }
}