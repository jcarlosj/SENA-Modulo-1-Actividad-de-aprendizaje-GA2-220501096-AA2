package estructuras_repetitivas;

import java.util.Scanner;

public class Punto06 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( " > Ingrese el valor de K: " );
        int K = scanner.nextInt();

        System.out.println( "*** Tabla de multiplicar de " + K );

        for ( int i = 1; i <= 12; i++ ) {
            System.out.println( K + " x " + i + " = " + ( K * i ) );
        }
    }
}
