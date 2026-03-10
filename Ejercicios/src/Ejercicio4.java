public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println("Ingrese un numero entero:");
        int n = Utilidades.leerEntero();

        if(Utilidades.esPar(n) && n >= 0){
            System.out.println("Par positivo");
        }
        else if(Utilidades.esPar(n) && n < 0){
            System.out.println("Par negativo");
        }
        else if(!Utilidades.esPar(n) && n >= 0){
            System.out.println("Impar positivo");
        }
        else{
            System.out.println("Impar negativo");
        }

    }
}