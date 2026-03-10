public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println("Ingrese un numero entero:");
        int n = Utilidades.leerEntero();

        if(Utilidades.esPar(n)){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }

    }
}