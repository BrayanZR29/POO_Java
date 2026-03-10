public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println("Ingrese primer numero:");
        int a = Utilidades.leerEntero();

        System.out.println("Ingrese segundo numero:");
        int b = Utilidades.leerEntero();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Primer numero: " + a);
        System.out.println("Segundo numero: " + b);

    }
}