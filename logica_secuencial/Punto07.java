package logica_secuencial;

import java.util.Scanner;

public class Punto07 {
    public static void main( String[] args ) {
        // Declaramos las variables
        int minutos;
        double costoPorMinuto;

        // Leemos los valores
        Scanner sc = new Scanner( System.in );
        System.out.print( " > Ingrese la duración de la llamada en minutos: " );
        minutos = sc.nextInt();
        System.out.print( " > Ingrese el costo por minuto: $" );
        costoPorMinuto = sc.nextDouble();

        // Imprimimos el costo de la llamada
        System.out.println("*** El costo de la llamada es: $" + ( minutos * costoPorMinuto ) + " ***" );
    }
}
