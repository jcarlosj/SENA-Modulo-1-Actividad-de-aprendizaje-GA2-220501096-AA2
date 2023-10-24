package estructuras_repetitivas;

import java.util.Scanner;

public class Punto02 {
    public static void main( String[] args ) {
        
        Scanner scanner = new Scanner( System.in );
        System.out.print( " > Ingrese el valor de N: " );
        int inputNumber = scanner.nextInt();

        int cero = 0;
        int menoresCero = 0;
        int mayoresCero = 0;

        for ( int i = 1; i <= inputNumber; i++ ) {
            System.out.print( " > Ingrese el número " + i + ": " );

            int numero = scanner.nextInt();

            if ( numero == 0 )
                cero++;
            else if ( numero < 0 )
                menoresCero++;
            else
                mayoresCero++;

        }

        System.out.println( "*** Cantidad de ***" );
        System.out.println( " * ceros: " + cero );
        System.out.println( " * números menores a cero: " + menoresCero );
        System.out.println( " * números mayores a cero: " + mayoresCero );

    }
}
