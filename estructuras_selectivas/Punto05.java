package estructuras_selectivas;

import java.util.Scanner;

public class Punto05 {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Ingrese la cantidad de años de antigüedad del empleado: " );
        int antiguedad = scanner.nextInt();

        int bono;

        if ( antiguedad > 0 && antiguedad < 6 ) {
            bono = 100 * antiguedad;
        } 
        else {
            bono = 1000;
        }

        System.out.println("*** El bono que recibirá el trabajador es: " + bono + " ***" );

    }
}
