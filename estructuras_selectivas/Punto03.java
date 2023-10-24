package estructuras_selectivas;

import java.util.Scanner;

public class Punto03 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Ingrese el número de horas: " );
        int horas = scanner.nextInt();
        double costoTotal = calcularCostoEstacionamiento( horas );
        System.out.println( "*** El costo total es: $" + costoTotal + " ***" );
    }

    public static double calcularCostoEstacionamiento( int horas ) {
        double costoTotal = 0;
        if ( horas <= 2 ) {
            costoTotal = horas * 5.00;
        } else if ( horas <= 5 ) {
            costoTotal = 2 * 5.00 + ( horas - 2 ) * 4.00;
        } else if ( horas <= 10 ) {
            costoTotal = 2 * 5.00 + 3 * 4.00 + ( horas - 5 ) * 3.00;
        } else {
            costoTotal = 2 * 5.00 + 3 * 4.00 + 5 * 3.00 + ( horas - 10 ) * 2.00;
        }

        return costoTotal;
    }
}
