import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Utilidades {

    static Scanner sc = new Scanner(System.in);

    public static int leerEntero() {
        return sc.nextInt();
    }

    public static double leerDecimal() {
        return sc.nextDouble();
    }

    public static int generarAleatorio(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static int calcularEdad(int anio, int mes, int dia) {
        LocalDate nacimiento = LocalDate.of(anio, mes, dia);
        LocalDate hoy = LocalDate.now();
        Period p = Period.between(nacimiento, hoy);
        return p.getYears();
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
}