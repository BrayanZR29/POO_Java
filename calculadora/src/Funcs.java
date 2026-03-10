public class Funcs {

    public int resultInt;
    public double resultDouble;

    // enteros
    public void suma(int a, int b){
        resultInt = a + b;
        System.out.printf("La suma de %d y %d es %d\n\n", a, b, resultInt);
    }

    public void resta(int a, int b){
        resultInt = a - b;
        System.out.printf("La resta de %d y %d es %d\n\n", a, b, resultInt);
    }

    public void multiplicion(int a, int b){
        resultInt = a * b;
        System.out.printf("La multiplicacion de %d y %d es %d\n\n", a, b, resultInt);
    }

    public void division(int a, int b){
        resultInt = a / b;
        System.out.printf("La division de %d y %d es %d\n\n", a, b, resultInt);
    }

}