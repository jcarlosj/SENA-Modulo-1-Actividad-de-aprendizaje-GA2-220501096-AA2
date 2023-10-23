package logica_secuencial;

import java.util.Scanner;

public class Punto04 {
    public static void main( String[] args ) {
        // Declaramos las variables
        int metrosCuadrados;
        double precioMetroCuadrado;
        double presupuesto;

        System.out.println( "=== La brocha gorda ===" );

        // Leemos los valores
        Scanner sc = new Scanner( System.in );
        System.out.print( "Ingrese el área a pintar en metros cuadrados: " );
        metrosCuadrados = sc.nextInt();
        
        System.out.print( "Ingrese el precio por metro cuadrado: " );
        precioMetroCuadrado = sc.nextDouble();

        // Calculamos el presupuesto
        presupuesto = metrosCuadrados * precioMetroCuadrado;

        // Imprimimos el presupuesto
        System.out.println( "El presupuesto es: " + presupuesto );
    }
}
