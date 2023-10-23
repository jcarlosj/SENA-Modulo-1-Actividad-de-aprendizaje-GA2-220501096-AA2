import java.util.Scanner;

class Punto01 {
    public static void main( String[] args) {
        // Declaramos las variables
        double base;
        double altura;
        double area;

        // Leemos los valores de base y altura
        Scanner sc = new Scanner(System.in);
        System.out.println( "Ingrese la base del triángulo: " );
        base = sc.nextDouble();
        System.out.println( "Ingrese la altura del triángulo: " );
        altura = sc.nextDouble();

        // Calculamos el área
        area = base * altura / 2;

        // Imprimimos el área
        System.out.println( "El área del triángulo es: " + area );
    }
}