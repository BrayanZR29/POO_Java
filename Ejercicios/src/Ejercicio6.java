public class Ejercicio6 {

    public static void main(String[] args) {

        System.out.println("Ingrese numero de telefono:");
        long telefono = Utilidades.sc.nextLong();

        String numero = String.valueOf(telefono);
        String prefijo = numero.substring(0,3);

        if(prefijo.equals("300") || prefijo.equals("301")){
            System.out.println("Claro");
        }
        else if(prefijo.equals("310") || prefijo.equals("311")){
            System.out.println("Movistar");
        }
        else if(prefijo.equals("320") || prefijo.equals("321")){
            System.out.println("Tigo");
        }
        else{
            System.out.println("Operador desconocido");
        }

    }
}