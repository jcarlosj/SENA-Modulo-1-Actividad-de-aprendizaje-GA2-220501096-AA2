package logica_secuencial;

import java.util.Scanner;

public class Punto05 {
    public static void main( String[] args ) {
        // Declaramos las variables
        int kilómetros;
        double costoPorKilómetro;
        double costoBoleto;

        System.out.println( "=== La curva loca ===" );

        // Leemos los valores
        Scanner sc = new Scanner( System.in );
        System.out.print( "Ingrese la distancia a recorrer en kilómetros: " );
        kilómetros = sc.nextInt();
        
        System.out.print( "Ingrese el costo por kilómetro: $" );
        costoPorKilómetro = sc.nextDouble();

        // Imprimimos el costo del boleto
        System.out.println( "El costo del boleto es: $" + ( kilómetros * costoPorKilómetro ) );
    }
}
