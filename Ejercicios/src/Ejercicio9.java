public class Ejercicio9 {

    public static void main(String[] args) {

        System.out.println("Ingrese edad:");
        int edad = Utilidades.leerEntero();

        if(edad >=0 && edad <=3){
            System.out.println("Bebe");
        }
        else if(edad >=4 && edad <=8){
            System.out.println("Niño");
        }
        else if(edad >=13 && edad <=17){
            System.out.println("Adolescente");
        }
        else{
            System.out.println("Adulto");
        }

    }
}