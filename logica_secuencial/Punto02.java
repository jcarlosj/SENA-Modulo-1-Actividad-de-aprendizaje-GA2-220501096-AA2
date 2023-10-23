package logica_secuencial;

import java.util.Scanner;

public class Punto02 {
    public static void main( String[] args ) {
        // Declaramos las variables
        double pesosColombianos;
        final double tasaCambio;
        double dolares;

        // Leemos el valor de pesosColombianos
        Scanner sc = new Scanner( System.in );
        System.out.println( "Ingrese la cantidad de pesos colombianos:" );
        pesosColombianos = sc.nextDouble();

        // Declaramos la tasa de cambio
        tasaCambio = 4238;

        // Calculamos la cantidad de dólares
        dolares = pesosColombianos / tasaCambio;

        // Imprimimos la cantidad de dólares
        System.out.println( "La cantidad de dólares que se pueden adquirir con " + pesosColombianos + " pesos colombianos es: " + dolares );
    }
}
